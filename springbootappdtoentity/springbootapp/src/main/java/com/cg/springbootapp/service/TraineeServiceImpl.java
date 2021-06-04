package com.cg.springbootapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.springbootapp.dto.TraineeDto;
import com.cg.springbootapp.entity.Trainee;
import com.cg.springbootapp.exception.DuplicateTraineeException;
import com.cg.springbootapp.exception.TraineeNotFoundException;
import com.cg.springbootapp.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public TraineeDto saveTrainee(TraineeDto traineeDto) throws DuplicateTraineeException  {
		
		Trainee trainee = convertDtoToEntity(traineeDto);
		
		Optional<Trainee> traineeObj = traineeRepository.findById(trainee.getTraineeId());
		
        if (traineeObj.isPresent()) {
            throw new DuplicateTraineeException("Trainee Already Existing With Id: "+trainee.getTraineeId());
        }         
		
		return convertEntityToDto(traineeRepository.save(trainee));			
	}

	@Override
	public void deleteTrainee(int traineeId) {
		
		traineeRepository.deleteById(traineeId);
		
	}


	@Override
	public void modifyTrainee(TraineeDto traineeDto) {
		
		Trainee trainee = convertDtoToEntity(traineeDto);
		
		traineeRepository.save(trainee);
		
	}

	@Override
	public TraineeDto fetchTraineeById(int traineeId) throws TraineeNotFoundException {	
		
		Optional<Trainee> trainee = traineeRepository.findById(traineeId);
		if(trainee.isEmpty()) {
			throw new TraineeNotFoundException("No Trainee is Existing With id: "+traineeId);
			
		}
		return convertEntityToDto(traineeRepository.findById(traineeId).get());		
	}

	@Override
	public List<TraineeDto> fetchAllTrainees() {
		
		List<Trainee> trainees = traineeRepository.findAll();
		
		List<TraineeDto> traineesDto = new ArrayList<>();
	
		
		
		return traineesDto;
	
	}


	@Override
	public List<TraineeDto> fetchTrineesFromDomain(String domainName) {			
		
		List<Trainee> trainees = traineeRepository.findByTraineeDomain(domainName);
		
		List<TraineeDto> traineesDto = new ArrayList<>();
		
		return traineesDto;
		
	}


	@Override
	public List<TraineeDto> fetchTrineesInOrderByLocation() {
		
		List<Trainee> trainees = traineeRepository.getAllTraineeesInOrderByLocation();
		
		List<TraineeDto> traineesDto = new ArrayList<>();
		
		return traineesDto;
	}
	
	private TraineeDto convertEntityToDto(Trainee trainee) {
		
		TraineeDto traineeDto = new TraineeDto();
		traineeDto.setTraineeId(trainee.getTraineeId());
		traineeDto.setTraineeName(trainee.getTraineeName());
		traineeDto.setTraineeDomain(trainee.getTraineeDomain());
		traineeDto.setTraineeLocation(trainee.getTraineeLocation());
		
		return traineeDto;
		
	}
	
	private Trainee convertDtoToEntity(TraineeDto traineeDto) {
		
		Trainee trainee = new Trainee();
		trainee.setTraineeId(traineeDto.getTraineeId());
		trainee.setTraineeName(traineeDto.getTraineeName());
		trainee.setTraineeDomain(traineeDto.getTraineeDomain());
		trainee.setTraineeLocation(traineeDto.getTraineeLocation());
		
		return trainee;
		
	}

}
