package com.custom.exceptions;

class CountryNotValidException extends Exception{
	public CountryNotValidException(){
		System.out.println("The employee should be an Indian citizen for calculating tax");
	}
	
}
