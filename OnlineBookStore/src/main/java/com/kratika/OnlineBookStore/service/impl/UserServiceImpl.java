package com.kratika.OnlineBookStore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public List<Users> getAllUsers() {
		System.out.println("getAllUsers");
		return userRepository.findAll();
	}

	
}
