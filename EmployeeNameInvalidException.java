package com.custom.exceptions;

class EmployeeNameInvalidException extends Exception {
	public EmployeeNameInvalidException(){
		System.out.println("The employee name cannot be empty");
	}
}
