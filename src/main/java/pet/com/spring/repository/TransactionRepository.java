package pet.com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pet.com.spring.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}

