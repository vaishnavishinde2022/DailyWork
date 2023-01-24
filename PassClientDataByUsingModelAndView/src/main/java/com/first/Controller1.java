package com.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * @Controller is use to indicate that the class is a front controller and responsible to handle user requests and
 * return the appropriate responses.
 */
@Controller
public class Controller1 
{
	/*
	 * @RequestMapping is a class level and method level annotation,it is used to process HTTP request with specified URL pattern.
	 * It is used in and along with both @Controller and @RestController.
	 * 
	 */
	@RequestMapping("/courses")
	
  public ModelAndView courses(@RequestParam("coursename")String courseName)
  {
		/*
		 * ModelAndView is a class present in org.springframework.web.servlet package.
		 * ModelAndView is a value object designed to hold model and view making it possible for a hanbler to return
		 * both model and view in a single return value.
		 */
		ModelAndView mv=new ModelAndView();
		mv.addObject("cname",courseName);
		
		mv.setViewName("courses.jsp");
		
		return mv;
	  
  }
}
