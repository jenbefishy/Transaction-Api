package pet.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import pet.com.spring.model.User;
import pet.com.spring.service.UserService;
import pet.com.spring.exception.EmailAlreadyExistsException;
import pet.com.spring.exception.UserNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/users/")
@AllArgsConstructor
public class UserController {
	@Autowired
	private final UserService userService;

	@PostMapping("")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		try {
			User newUser = userService.addUser(user);
			return new ResponseEntity<>(newUser, HttpStatus.CREATED);
		} catch (EmailAlreadyExistsException e) {
			return new ResponseEntity<>(null, HttpStatus.CONFLICT);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
		try {
			User updatedUser = userService.updateUser(id, userDetails);
			return ResponseEntity.ok(updatedUser);
		} catch (EmailAlreadyExistsException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
		} catch (UserNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
		try {
			userService.deleteUser(id);
			return ResponseEntity.noContent().build();
		} catch (UserNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		try {
			User user = userService.getUserById(id);
			return ResponseEntity.ok(user);
		} catch (UserNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@GetMapping("")
	public List<User> getAllUsers() {
		System.out.println("HELLO");
		return userService.getAllUsers();
	}
}

