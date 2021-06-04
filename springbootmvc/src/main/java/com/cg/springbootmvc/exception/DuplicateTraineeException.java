package com.cg.springbootmvc.exception;

import com.cg.springbootmvc.entity.Trainee;

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
}
