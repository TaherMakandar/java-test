package com.springboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@GetMapping("/hello")
	public String helloworld()
	{
		return "This is my teritory "
				+ "So Be Carefull";
		
	}
}
