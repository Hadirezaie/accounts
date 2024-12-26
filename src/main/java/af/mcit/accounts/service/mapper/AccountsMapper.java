package af.mcit.accounts.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import af.mcit.accounts.entity.Accounts;
import af.mcit.accounts.service.dto.AccountsDto;

@Mapper(componentModel = "spring")
public interface AccountsMapper {
    AccountsMapper INSTANCE = Mappers.getMapper(AccountsMapper.class);

    AccountsDto mapToAccountsDto(Accounts accounts);

    Accounts mapToAccounts(AccountsDto accountsDto);

}
