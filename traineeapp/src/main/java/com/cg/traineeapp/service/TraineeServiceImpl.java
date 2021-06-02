package com.cg.traineeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.traineeapp.dao.TraineeDao;
import com.cg.traineeapp.entity.Trainee;

@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeDao traineeDao;

	@Transactional
	@Override
	public void saveTrainee(Trainee trainee) {
		
		traineeDao.addTrainee(trainee);
		
	}

	@Transactional
	@Override
	public void deleteTrainee(int traineeId) {
		
		traineeDao.deleteTrainee(traineeId);
		
	}

	@Override
	public void modifyTrainee(Trainee trainee) {
		
		traineeDao.updateTrainee(trainee);
		
	}

	@Override
	public Trainee fetchTraineeById(int traineeId) {	
		
		return traineeDao.getTraineeById(traineeId);
	}

	@Override
	public List<Trainee> fetchAllTrainees() {
		
		return traineeDao.getAllTrainees();
	}

}
