package com.example.demo.Exception;

public class EmployeeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6191550727495017492L;

	public EmployeeException(String statement) {
		super(statement);
	}

}
