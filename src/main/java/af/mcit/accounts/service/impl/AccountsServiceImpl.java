package af.mcit.accounts.service.impl;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import af.mcit.accounts.constants.AccountsConstants;
import af.mcit.accounts.entity.Accounts;
import af.mcit.accounts.entity.Customer;
import af.mcit.accounts.exceptions.CustomerAlreadyExistsException;
import af.mcit.accounts.repository.AccountsRepository;
import af.mcit.accounts.repository.CustomerRepository;
import af.mcit.accounts.service.IAccountsService;
import af.mcit.accounts.service.dto.CustomerDto;
import af.mcit.accounts.service.mapper.CustomerMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private final AccountsRepository accountsRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already registered with given mobileNumber "
                    + customerDto.getMobileNumber());
        }
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }

}
