package com.cg.springbootapp.service;

import java.util.List;
import java.util.Optional;

import com.cg.springbootapp.entity.Trainee;
import com.cg.springbootapp.exception.DuplicateTraineeException;
import com.cg.springbootapp.exception.TraineeNotFoundException;

public interface TraineeService {	

	public Trainee saveTrainee(Trainee trainee) throws DuplicateTraineeException;
	
	public void deleteTrainee(int traineeId) throws TraineeNotFoundException ;
	
	public void modifyTrainee(Trainee trainee) throws TraineeNotFoundException;
	
	public Trainee fetchTraineeById(int traineeId) throws TraineeNotFoundException;
	
	public List<Trainee> fetchAllTrainees();
	
	public List<Trainee> fetchTrineesFromDomain(String domainName);
	
	public List<Trainee> fetchTrineesInOrderByLocation();

}
