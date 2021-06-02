package com.cg.traineeapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trainee getTraineeById(int traineeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

}
