package com.kratika.OnlineBookStore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kratika.OnlineBookStore.dto.UserDTO;
import com.kratika.OnlineBookStore.entity.Users;
import com.kratika.OnlineBookStore.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	static {
		System.out.println("UserController");
	}

	@GetMapping("/all")
	public List<Users> getAllUsers() {
		List<Users> usersList = userService.getAllUsers();
		return usersList; 
	}

	@GetMapping("/id/{id}")
	public UserDTO getUserById(@PathVariable Long id ) {
		UserDTO usersList = userService.getUserById(id);
		return usersList;
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody Users user) {
		Optional<Users> existingUser = userService.findByUsername(user.getUsername());

		if (existingUser.isPresent()) {
			return new ResponseEntity<>("Username is already taken", HttpStatus.CONFLICT);
		} else {
			userService.addNewCustomer(user);
			return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
		}
	}

}
