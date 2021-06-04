package com.cg.springbootapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.springbootapp.entity.Trainee;
import com.cg.springbootapp.exception.DuplicateTraineeException;
import com.cg.springbootapp.exception.TraineeNotFoundException;
import com.cg.springbootapp.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public Trainee saveTrainee(Trainee trainee) {
		
		final Optional<Trainee> traineeObj = traineeRepository.findById(trainee.getTraineeId());
        if (traineeObj.isPresent()) {
            throw new DuplicateTraineeException(trainee);
        }       
		
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
	public Trainee fetchTraineeById(int traineeId) {	
		
		Optional<Trainee> trainee = traineeRepository.findById(traineeId);
		if(trainee.isEmpty()) {
			throw new TraineeNotFoundException("No Trainee is Existing With id: "+traineeId);
			
		}
		return traineeRepository.findById(traineeId).get();
		
		
	}

	@Override
	public List<Trainee> fetchAllTrainees() {
		
	
		
		return traineeRepository.findAll();
	}


	@Override
	public List<Trainee> fetchTrineesFromDomain(String domainName) {
		
			
		return traineeRepository.findByTraineeDomain(domainName);
	}


	@Override
	public List<Trainee> fetchTrineesInOrderByLocation() {
		
		return traineeRepository.getAllTraineeesInOrderByLocation();
	}

}
