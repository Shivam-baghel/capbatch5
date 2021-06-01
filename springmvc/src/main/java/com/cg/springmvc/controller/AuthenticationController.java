package com.cg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.springmvc.bean.Registration;

@Controller
public class AuthenticationController {
	
	@RequestMapping("/regform")
	public String getRegForm() {
		
		return "registration";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String doRegister(@ModelAttribute Registration reg, Model model ) {
		
		model.addAttribute("reg", reg);	
		
		return "registration-success";
	}

}
