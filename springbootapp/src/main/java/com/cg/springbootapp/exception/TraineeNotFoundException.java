package com.cg.springbootapp.exception;

public class TraineeNotFoundException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TraineeNotFoundException() {
    	
	       
    }

	public TraineeNotFoundException(String message) {
    	
        super(message);
    }
}
