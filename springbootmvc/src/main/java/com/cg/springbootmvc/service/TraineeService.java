package com.cg.springbootmvc.service;

import java.util.List;

import com.cg.springbootmvc.entity.Trainee;

public interface TraineeService {	

	public void saveTrainee(Trainee trainee);
	
	public void deleteTrainee(int traineeId);
	
	public void modifyTrainee(Trainee trainee);
	
	public Trainee fetchTraineeById(int traineeId);
	
	public List<Trainee> fetchAllTrainees();

}
