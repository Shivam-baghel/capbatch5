package com.cg.springbootapp.exception;

import com.cg.springbootapp.entity.Trainee;

public class DuplicateTraineeException extends RuntimeException {
	

    private Trainee trainee;
    
    private String message;
    
    public DuplicateTraineeException(String message) {
        super(message);
    }

    public DuplicateTraineeException(Trainee trainee) {
        this.trainee = trainee;
    }

	public Trainee getTrainee() {
		return trainee;
	}	
	
}
