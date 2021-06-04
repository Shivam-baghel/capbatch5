package com.cg.springbootmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CustomGlobalExceptionHandler {

	@ExceptionHandler(value = DuplicateTraineeException.class)
    public ModelAndView duplicateTraineeException(DuplicateTraineeException e) {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ref", e.getTrainee().getTraineeId());
        modelAndView.addObject("message", "Cannot add. Tainedd is already existing with id: "+e.getTrainee().getTraineeId());
        modelAndView.setViewName("error-trainee");
        return modelAndView;
    }

}
