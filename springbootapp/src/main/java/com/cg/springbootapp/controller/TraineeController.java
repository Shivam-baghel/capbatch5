package com.cg.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootapp.entity.Trainee;
import com.cg.springbootapp.service.TraineeService;

@RestController
@RequestMapping("/trainees")
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	
	@GetMapping("/getall")
	public List<Trainee> getAllTrainees() {
		
		List<Trainee> trainees = traineeService.fetchAllTrainees();
		
		return trainees;
	}
	
	@GetMapping("/{traineeId}")
	public Trainee getTrainee(@PathVariable("traineeId") int traineeId) {
		
		Trainee trainee = traineeService.fetchTraineeById(traineeId).get();
		
		return trainee;
	}
	
	@PostMapping("/save")
	public void saveTrainee(@RequestBody Trainee trainee) {
		
		traineeService.saveTrainee(trainee);
	}
	
	@DeleteMapping("/{traineeId}")
	public void deleteTrainee(@PathVariable("traineeId") int traineeId) {
		traineeService.deleteTrainee(traineeId);
	}
	
	@PutMapping("/update")
	public void updateTrainee(@RequestBody Trainee trainee) {
		
		traineeService.modifyTrainee(trainee);		
	}	
	
}
