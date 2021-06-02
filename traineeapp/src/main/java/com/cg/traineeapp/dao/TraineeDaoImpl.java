package com.cg.traineeapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.traineeapp.entity.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {
	
	@PersistenceContext
	private EntityManager entityManger;

	@Override
	public void addTrainee(Trainee trainee) {
		
		entityManger.persist(trainee);
		
	}

	@Override
	public void deleteTrainee(int traineeId) {
		Trainee trainee = entityManger.find(Trainee.class, traineeId);	
		entityManger.remove(trainee);		
	}

	@Override
	public void updateTrainee(Trainee trainee) {
		
		Trainee traineeObj = entityManger.find(Trainee.class, trainee.getTraineeId());			
		traineeObj.setTraineeName(trainee.getTraineeName());
		traineeObj.setTraineeLocation(trainee.getTraineeLocation());
		traineeObj.setTraineeDomain(trainee.getTraineeDomain());		
	}

	@Override
	public Trainee getTraineeById(int traineeId) {
		Trainee trainee = entityManger.find(Trainee.class, traineeId);		
		return trainee;
	}

	@Override
	public List<Trainee> getAllTrainees() {
		TypedQuery<Trainee> query = entityManger.createQuery("Select t from Trainee t", Trainee.class);
		List<Trainee> trainees = query.getResultList();		
		return trainees;
	}

}
