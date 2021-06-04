package com.cg.springbootmvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springbootmvc.entity.Trainee;
import com.cg.springbootmvc.exception.DuplicateTraineeException;
import com.cg.springbootmvc.exception.TraineeNotFoundException;
import com.cg.springbootmvc.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public Trainee saveTrainee(Trainee trainee) {
	
		Optional<Trainee> traineeObj = traineeRepository.findById(trainee.getTraineeId());
		
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
		
		
	}

	@Override
	public Trainee fetchTraineeById(int traineeId) {
		
		Optional<Trainee> trainee = traineeRepository.findById(traineeId);
		if(trainee.isEmpty()) {
			throw new TraineeNotFoundException("Trainee not existing with id: "+traineeId);
		}
		return trainee.get();
		
	}

	@Override
	public List<Trainee> fetchAllTrainees() {
		
		return traineeRepository.findAll();
	}
	
	
	
//	@Autowired
//	private TraineeDao traineeDao;
//
//	@Transactional
//	@Override
//	public void saveTrainee(Trainee trainee) {
//		
//		traineeDao.addTrainee(trainee);
//		
//	}
//
//	@Transactional
//	@Override
//	public void deleteTrainee(int traineeId) {
//		
//		traineeDao.deleteTrainee(traineeId);
//		
//	}
//
//	@Transactional
//	@Override
//	public void modifyTrainee(Trainee trainee) {
//		
//		traineeDao.updateTrainee(trainee);
//		
//	}
//
//	@Override
//	public Trainee fetchTraineeById(int traineeId) {	
//		
//		return traineeDao.getTraineeById(traineeId);
//	}
//
//	@Override
//	public List<Trainee> fetchAllTrainees() {
//		
//		return traineeDao.getAllTrainees();
//	}

}
