package com.example.demo.Exception.ControllerAdvice;


	import org.springframework.http.HttpStatus;

	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;

	
import com.example.demo.Exception.EmployeeException;

	@ControllerAdvice
	public class EmployeeControllerAdvice {
		
		@ExceptionHandler(EmployeeException.class)
		public ResponseEntity<String> handleEmployeeAlreadyExistsException(EmployeeException employeeAlreadyExistsException)
		{
			return new ResponseEntity<String>("Employee Already Exists in the Database", HttpStatus.BAD_REQUEST);
		}
	}


