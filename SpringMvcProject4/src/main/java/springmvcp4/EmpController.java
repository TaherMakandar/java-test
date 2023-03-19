package springmvcp4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class EmpController 
{
	 @Autowired    
	    EmpDao dao;
	 
	 
	 @RequestMapping("/empform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Emp());  
	        return "empform";   
	    }    
	 @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("emp") Emp emp){    
	        dao.save(emp);    
	        return "redirect:/viewemp";  
	    }    
	 
	 @RequestMapping("/viewemp")    
	    public String viewemp(Model m){    
	        List<Emp> list=dao.getEmployees();    
	        m.addAttribute("list",list);  
	        return "viewemp";    
	    }    
}
