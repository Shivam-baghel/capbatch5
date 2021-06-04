package com.cg.springbootapp.service;

import java.util.List;
import java.util.Optional;

import com.cg.springbootapp.entity.Trainee;

public interface TraineeService {	

	public Trainee saveTrainee(Trainee trainee);
	
	public void deleteTrainee(int traineeId);
	
	public void modifyTrainee(Trainee trainee);
	
	public Trainee fetchTraineeById(int traineeId);
	
	public List<Trainee> fetchAllTrainees();
	
	public List<Trainee> fetchTrineesFromDomain(String domainName);
	
	public List<Trainee> fetchTrineesInOrderByLocation();

}
