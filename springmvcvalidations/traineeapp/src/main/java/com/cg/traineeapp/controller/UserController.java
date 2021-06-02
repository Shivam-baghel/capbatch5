package com.cg.traineeapp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.traineeapp.bean.User;

@Controller
public class UserController {

	@RequestMapping("/adduser")
	public String showForm(Model model) {		
		User user = new User();		
		model.addAttribute("user",user);
		return "adduser";
	}
	
	@RequestMapping(value="/process",method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("user")  User user, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "adduser";
		}
		
		return "success";		
	}
}
