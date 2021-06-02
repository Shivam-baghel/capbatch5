package com.cg.traineeapp.service;

import java.util.List;

import com.cg.traineeapp.entity.Trainee;

public interface TraineeService {	

	public void saveTrainee(Trainee trainee);
	
	public void deleteTrainee(int traineeId);
	
	public void modifyTrainee(Trainee trainee);
	
	public Trainee fetchTraineeById(int traineeId);
	
	public List<Trainee> fetchAllTrainees();

}
