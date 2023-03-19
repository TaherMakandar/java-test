package com.jsp.UserManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.UserManagementSystem.dto.User;
@Repository
public interface UserRepository  extends JpaRepository<User,Integer>
{

}
