package com.jsp.WebApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.WebApplication.dto.Dto;
@Repository
public interface Repository1 extends JpaRepository<Dto,Integer>
{

}
