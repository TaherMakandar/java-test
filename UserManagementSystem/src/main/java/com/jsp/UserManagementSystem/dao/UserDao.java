package com.jsp.UserManagementSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.UserManagementSystem.dto.User;
import com.jsp.UserManagementSystem.repository.UserRepository;
@Repository
public class UserDao 
{
	@Autowired
	UserRepository repository;
	
	public User saveUser(User user)
	{
		return repository.save(user);
	}
	public List<User> getAllUsers()
	{
		return repository.findAll();
	}
	public void deleteByID(int id)
	{
	//	User u = getUserByID(id);
	//	if(u!=null)
		{
			repository.deleteById(id);
		}	
	}
}
