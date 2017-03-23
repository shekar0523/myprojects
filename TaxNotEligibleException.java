package com.custom.exceptions;

class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(){
		System.out.println("The employee does not need to pay tax");
	}
}
