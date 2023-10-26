package com.kratika.OnlineBookStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kratika.OnlineBookStore.dto.UserDTO;
import com.kratika.OnlineBookStore.entity.Users;
import com.kratika.OnlineBookStore.repository.UserRepository;
import com.kratika.OnlineBookStore.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	static {
		System.out.println("UserServiceImpl");
		}
	
	@Override
	public List<Users> getAllUsers() {
		System.out.println("getAllUsers");
		return userRepository.findAll();
	}

	@Override
	public UserDTO getUserById(Long id) {
		Users user =  userRepository.getReferenceById(id);
		UserDTO userDto = new UserDTO();
		userDto.setEmail(user.getEmail());
		userDto.setFullName(user.getFullName());
		userDto.setRole(user.getRole());
		userDto.setUserId(user.getUserId());
		
		return userDto;
	}

	@Override
	public Users addNewCustomer(Users us) {
		return userRepository.save(us);
	}

	@Override
	public Optional<Users> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	
}
