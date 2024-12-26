package af.mcit.accounts.service.mapper;

import af.mcit.accounts.entity.Accounts;
import af.mcit.accounts.service.dto.AccountsDto;

// @Mapper(componentModel = "spring")
public interface AccountsMapper {
    // AccountsMapper INSTANCE = Mappers.getMapper(AccountsMapper.class);
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
