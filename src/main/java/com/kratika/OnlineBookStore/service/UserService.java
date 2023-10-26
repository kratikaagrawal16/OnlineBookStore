package com.kratika.OnlineBookStore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kratika.OnlineBookStore.entity.Users;

@Service
public interface UserService {

	List<Users> getAllUsers();

	
}
