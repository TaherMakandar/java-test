package com.springboottest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@RequestMapping("/student")
	public String hello()
	{
		return  "Taher king";
	}
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> students=new ArrayList<>();
		students.add(new Student("Taher","King"));
		students.add(new Student("Hero","bhai"));
		students.add(new Student("Taher","Makandar"));
		students.add(new Student("Taher","bhai"));
		students.add(new Student("rolex","boss"));
		return students;
	}
	
}
