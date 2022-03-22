package com.Hospital.Patient_Info.globalException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorExceptionHandling {

@ExceptionHandler(ResourceNotFoundException.class )	
public ResponseEntity<?> errorResourceNotFound(ResourceNotFoundException ){
		
	ExceptionEntity exceptionEntity = new ExceptionEntity();
	
	
	
	}
	
	
}
