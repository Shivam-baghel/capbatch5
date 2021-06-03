package com.cg.springbootapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.springbootapp.entity.Trainee;
import com.cg.springbootapp.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public Trainee saveTrainee(Trainee trainee) {
		
		return traineeRepository.save(trainee);
			
	}


	@Override
	public void deleteTrainee(int traineeId) {
		
		traineeRepository.deleteById(traineeId);
		
	}


	@Override
	public void modifyTrainee(Trainee trainee) {
		
		traineeRepository.save(trainee);
		
	}

	@Override
	public Optional<Trainee> fetchTraineeById(int traineeId) {	
		
		return traineeRepository.findById(traineeId);
	}

	@Override
	public List<Trainee> fetchAllTrainees() {
		
		return traineeRepository.findAll();
	}

}
