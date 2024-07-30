package pet.com.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table(name = "usermodel")
public class User {
	@Id
	@GeneratedValue
	private long id;

	private String firstName;
	private String lastName;
	private Long balance;

	@Column(unique = true)
	private String email;
}

