package pl.sda.springboottraining.security;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserAccount, Long> {
    UserAccount findByUsername(String username);
}
