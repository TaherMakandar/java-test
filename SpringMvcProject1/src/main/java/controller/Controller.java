package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/hello")
public class Controller 
{
public ModelAndView  user(HttpServletRequest req,HttpServletResponse res) {
		

	
	
	
	ModelAndView mv= new ModelAndView();
	 {
		mv.setViewName("index.jsp");
		mv.addObject("name");
		mv.addObject("role");
	
	
		return mv;
	 }

	}
}