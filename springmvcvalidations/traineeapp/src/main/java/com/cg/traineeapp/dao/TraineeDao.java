package com.cg.traineeapp.dao;

import java.util.List;

import com.cg.traineeapp.entity.Trainee;

public interface TraineeDao {
	
	public void addTrainee(Trainee trainee);
	
	public void deleteTrainee(int traineeId);
	
	public void updateTrainee(Trainee trainee);
	
	public Trainee getTraineeById(int traineeId);
	
	public List<Trainee> getAllTrainees();

}
