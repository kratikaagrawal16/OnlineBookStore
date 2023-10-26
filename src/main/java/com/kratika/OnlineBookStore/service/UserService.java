package com.kratika.OnlineBookStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kratika.OnlineBookStore.dto.UserDTO;
import com.kratika.OnlineBookStore.entity.Users;

@Service
public interface UserService {

	List<Users> getAllUsers();

	UserDTO getUserById(Long id);

	Users addNewCustomer(Users us);

	Optional<Users> findByUsername(String username);

	
}
