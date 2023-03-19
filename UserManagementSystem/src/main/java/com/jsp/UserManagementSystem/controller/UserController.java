package com.jsp.UserManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.UserManagementSystem.dao.UserDao;
import com.jsp.UserManagementSystem.dto.User;
@RestController
public class UserController 
{
	@Autowired
	UserDao dao;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody User user)
	{
		dao.saveUser(user);
		return "insertion done";
	}
	@GetMapping("/user")
	public List<User> getUsers()
	{
		return dao.getAllUsers();
	}
	//@DeleteMapping("/user")
	//public void delete(@Requestparam int id)
	{
	//	dao.deleteByID(id);p
	}
}
