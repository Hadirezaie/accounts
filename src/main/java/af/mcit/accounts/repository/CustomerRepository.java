package af.mcit.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.mcit.accounts.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}