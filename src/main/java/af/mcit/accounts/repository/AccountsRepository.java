package af.mcit.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.mcit.accounts.entity.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}