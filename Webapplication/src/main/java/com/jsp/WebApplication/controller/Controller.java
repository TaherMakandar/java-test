package com.jsp.WebApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.WebApplication.dao.Dao;
import com.jsp.WebApplication.dto.Dto;


@RestController
public class Controller 
{
	@Autowired(required=true)
	Dao dao;
	
	@PostMapping("/dto")
	public String saveDao(@RequestBody Dto dto)
	{
		dao.saveDto(dto);
		return "insertion done";
	}
	@GetMapping("/dto")
	public List<Dto> getUsers()
	{
		return dao.getAllDtos();
	}
}
