package springmvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.LoginDao;







@Controller
public class StudentController 
{
	
	StudentDao dao= new StudentDao();
	@RequestMapping("/register")
	public ModelAndView UserRegistration(HttpServletRequest req,HttpServletResponse res) {
		
		String name=req.getParameter("name");
		String branch=req.getParameter("branch");
		String contact=req.getParameter("contact");
		String email=req.getParameter("email");
		String userName=req.getParameter("userName");
		String passWord=req.getParameter("passWord");
		
		String result=null;
		result=dao.userRegistration(name,branch,contact,email,userName,passWord);
		
		ModelAndView mv= new ModelAndView();
		if(result!=null) {
			mv.setViewName("Home.jsp");
			mv.addObject("name",userName);
		}else {
		    mv.setViewName("Registration1.jsp");	
		}
		
		return mv;
	}
}


