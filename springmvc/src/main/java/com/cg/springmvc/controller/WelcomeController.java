package com.cg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String process() {	
		
		return "success"; // view name ( jsp) /WEB-INF/views/success.jsp
	}
	
	@RequestMapping("/getlogin")
	public String loginForm() {		
		
		return "loginform"; // view name ( jsp) /WEB-INF/views/loginform.jsp
	}	
	
	@RequestMapping("/login")
	public String doLogin(@RequestParam("user") String username, Model model) {	
		
		model.addAttribute("myusername", username);
		
		return "loginsuccess"; // view name ( jsp) /WEB-INF/views/loginform.jsp
	}
	
}
