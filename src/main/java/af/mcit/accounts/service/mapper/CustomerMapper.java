package af.mcit.accounts.service.mapper;

import af.mcit.accounts.entity.Customer;
import af.mcit.accounts.service.dto.CustomerDto;

// @Mapper(componentModel = "spring")
public interface CustomerMapper {
    // CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
