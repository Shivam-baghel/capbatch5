package com.cg.springbootapp.service;

import java.util.List;
import java.util.Optional;

import com.cg.springbootapp.entity.Trainee;

public interface TraineeService {	

	public void saveTrainee(Trainee trainee);
	
	public void deleteTrainee(int traineeId);
	
	public void modifyTrainee(Trainee trainee);
	
	public Optional<Trainee> fetchTraineeById(int traineeId);
	
	public List<Trainee> fetchAllTrainees();

}
