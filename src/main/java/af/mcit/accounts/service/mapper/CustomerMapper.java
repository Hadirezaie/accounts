package af.mcit.accounts.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import af.mcit.accounts.entity.Customer;
import af.mcit.accounts.service.dto.CustomerDto;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto mapCustomerDto(Customer customer);

    Customer mapCustomer(CustomerDto customerDto);

}
