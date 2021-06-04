package com.cg.springbootapp.service;

import java.util.List;
import java.util.Optional;

import com.cg.springbootapp.dto.TraineeDto;
import com.cg.springbootapp.exception.DuplicateTraineeException;
import com.cg.springbootapp.exception.TraineeNotFoundException;

public interface TraineeService {	

	public TraineeDto saveTrainee(TraineeDto trainee) throws DuplicateTraineeException;
	
	public void deleteTrainee(int traineeId) throws TraineeNotFoundException ;
	
	public void modifyTrainee(TraineeDto trainee) throws TraineeNotFoundException;
	
	public TraineeDto fetchTraineeById(int traineeId) throws TraineeNotFoundException;
	
	public List<TraineeDto> fetchAllTrainees();
	
	public List<TraineeDto> fetchTrineesFromDomain(String domainName);
	
	public List<TraineeDto> fetchTrineesInOrderByLocation();

}
