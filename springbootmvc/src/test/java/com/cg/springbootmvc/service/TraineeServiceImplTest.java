package com.cg.springbootmvc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.cg.springbootmvc.entity.Trainee;
import com.cg.springbootmvc.exception.TraineeNotFoundException;
import com.cg.springbootmvc.repository.TraineeRepository;

@RunWith(MockitoJUnitRunner.class) // junit 4
public class TraineeServiceImplTest {
	
	@InjectMocks
	TraineeServiceImpl traineeService;
	
	@Mock
	TraineeRepository traineeRepository;	
	
	@Test
	public void fetchAllTrainees() {
		
		List<Trainee> trainees = new ArrayList<>();
		trainees.add(new Trainee(101,"Raj","JEE", "Chennai"));
		trainees.add(new Trainee(102,"Sameer","JEE", "Chennai"));
		trainees.add(new Trainee(103,"Kiran",".Net", "Pune"));
		trainees.add(new Trainee(104,"Kiran",".Net", "Pune"));
		trainees.add(new Trainee(105,"Kiran",".Net", "Pune"));
		
		when(traineeRepository.findAll()).thenReturn(trainees);		
		
		List<Trainee> traineeList = traineeService.fetchAllTrainees();
		
		assertEquals(5, traineeList.size());
		
	}	
	
	@Test
	public void testFetchTraineeByIdSuccess() {
		
		Trainee trainee = new Trainee(101,"Raj","JEE", "Chennai");
		when(traineeRepository.findById(101)).thenReturn(Optional.of(trainee));	
		
		Trainee traineeObj = traineeService.fetchTraineeById(101);		
		assertEquals("Raj", traineeObj.getTraineeName());	
		
		verify(traineeRepository, times(1)).findById(101);
	}	
	
	@Test
	public void testFetchTraineeByIdException() {
		
		when(traineeRepository.findById(101)).thenReturn(Optional.empty());

		assertThrows(TraineeNotFoundException.class, () -> traineeService.fetchTraineeById(101));
	}	
	
}
