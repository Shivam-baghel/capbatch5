package com.cg.springbootapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.springbootapp.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

	public List<Trainee> findByTraineeDomain(String domain);
	
	@Query(value = "Select t from Trainee t order by t.traineeLocation")
	public List<Trainee> getAllTraineeesInOrderByLocation();	
	

	  //@Query(value = "Select t from Trainee t  where t.traineeDomain = :name")
	  //public List<Trainee> getAllTraineesFormDomain();
	 
	
}
