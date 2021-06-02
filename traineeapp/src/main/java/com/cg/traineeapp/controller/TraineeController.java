package com.cg.traineeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.traineeapp.entity.Trainee;
import com.cg.traineeapp.service.TraineeService;

@Controller
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/addform")
	public String addTraineeForm() {
		
		return "addtrainee";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveTrainee(@ModelAttribute Trainee trainee) {
		
		traineeService.saveTrainee(trainee);		
		
		return "savetrainee";
	}	
	
}
