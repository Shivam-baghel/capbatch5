package com.cg.spingmvcjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/loginform")
	public String getLoginForm() {
		
		return "loginfrom";
	}

}
