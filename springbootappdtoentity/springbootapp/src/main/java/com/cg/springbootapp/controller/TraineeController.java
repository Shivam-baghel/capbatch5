package com.cg.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootapp.dto.TraineeDto;
import com.cg.springbootapp.service.TraineeService;


@RestController
@RequestMapping("/trainees")
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	
	@GetMapping("/getall")
	public List<TraineeDto> getAllTrainees() {		
		
		return traineeService.fetchAllTrainees();	
	}
	
	@GetMapping("/{traineeId}")
	public TraineeDto getTrainee(@PathVariable("traineeId") int traineeId) {		
				
		return traineeService.fetchTraineeById(traineeId);	
	}
	
	@PostMapping("/save")
	public ResponseEntity<TraineeDto> saveTrainee(@RequestBody TraineeDto trainee) {		
		
		TraineeDto newTrainee = traineeService.saveTrainee(trainee);		
		return new ResponseEntity<>(newTrainee,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{traineeId}")
	public ResponseEntity<?> deleteTrainee(@PathVariable("traineeId") int traineeId) {
		traineeService.deleteTrainee(traineeId);		
		return new ResponseEntity<>("Trainee Deleted Successfully",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateTrainee(@RequestBody TraineeDto trainee) {		
		traineeService.modifyTrainee(trainee);	
		return new ResponseEntity<>(trainee,HttpStatus.OK);
	}	
	
	@GetMapping("/getall/{domainName}")
	public List<TraineeDto> getAllTraineesFromDomain(@PathVariable("domainName") String domain) {			
		return  traineeService.fetchTrineesFromDomain(domain)	;
	}
	
	@GetMapping("/getall/order")
	public List<TraineeDto> getAllTraineesInOrder() {		
		
		return traineeService.fetchTrineesInOrderByLocation();
	}
}
