package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRecord;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public List<UserRecord> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@RequestMapping(name = "/adduser",method = RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord)
	{
		userService.adduser(userRecord);
	}
	
}
