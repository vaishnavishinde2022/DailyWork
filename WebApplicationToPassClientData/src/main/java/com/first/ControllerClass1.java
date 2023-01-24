package com.first;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/**@RestController**/

/*
 * @Controller is use to indicate that the class is a front controller and responsible to handle user requests and
 * return the appropriate responses.
 */
@Controller
public class ControllerClass1 
{
	/*
	 * @RequestMapping is a class level and method level annotation,it is used to process HTTP request with specified URL pattern.
	 * It is used in and along with both @Controller and @RestController.
	 * 
	 */
	@RequestMapping("/courses")
  public String courses(HttpServletRequest req)
  {
		HttpSession session=req.getSession();
		
		String course=req.getParameter("course");
		
		session.setAttribute("yourCourse", course);
	  return "courses.jsp";
  }
}
