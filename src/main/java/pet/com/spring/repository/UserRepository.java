package pet.com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pet.com.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}

