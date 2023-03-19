package com.jsp.WebApplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.WebApplication.dto.Dto;
import com.jsp.WebApplication.repository.Repository1;

@Repository
public class Dao 
{
	@Autowired
	Repository1 repository;
	
	public Dto saveDto(Dto dto)
	{
		return repository.save(dto);
	}
	public List<Dto> getAllDtos()
	{
		return repository.findAll();
	}
}
