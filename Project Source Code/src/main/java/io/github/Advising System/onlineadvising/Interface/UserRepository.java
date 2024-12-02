package io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface;

import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
