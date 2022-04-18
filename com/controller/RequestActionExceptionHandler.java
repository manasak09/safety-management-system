package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RequestActionExceptionHandler {
	@ExceptionHandler(DeleteRequestActionException.class)
	public ResponseEntity<?> handleDeleteException(DeleteRequestActionException e,WebRequest requ)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(LogRequestActionException.class)
	public ResponseEntity<?> handleLogException(LogRequestActionException e1, WebRequest requ1)
	{
		return new ResponseEntity<>(e1.toString(),HttpStatus.NO_CONTENT);
	}
	
}
