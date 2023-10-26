package com.kratika.OnlineBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kratika.OnlineBookStore.entity.Users;
import com.kratika.OnlineBookStore.service.UserService;


@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	static {
		System.out.println("UserController");
		}
	
	@GetMapping("all")
	public List<Users> getAllUsers() {
		List<Users> a = userService.getAllUsers();
		System.out.println(a.size());
		return a;
	}
	
}
