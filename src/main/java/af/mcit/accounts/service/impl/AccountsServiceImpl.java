package af.mcit.accounts.service.impl;

import org.springframework.stereotype.Service;

import af.mcit.accounts.repository.AccountsRepository;
import af.mcit.accounts.repository.CustomerRepository;
import af.mcit.accounts.service.IAccountsService;
import af.mcit.accounts.service.dto.CustomerDto;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }

}
