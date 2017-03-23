package com.custom.exceptions;

public class TaxCalculator {
	String empName = null;
	boolean isIndian = false;
	double empSal = 0.0;
	
	//public double calculateTax(String x,boolean y, double z){
	@SuppressWarnings("finally")
	public double calculateTax(){	
		double tax = 0.0;
		try {
		if(empName == null){
			throw new EmployeeNameInvalidException();
		}else if(isIndian == false){
			throw new CountryNotValidException();
		}else if(empSal > 100000) tax=empSal*8/100;
		else if(empSal > 50000) tax=empSal*6/100;
		else if(empSal > 30000) tax=empSal*5/100;
		else if(empSal > 10000) tax=empSal*4/100;
		else throw new TaxNotEligibleException();
		
		}catch(CountryNotValidException ex){
			
		}catch(EmployeeNameInvalidException ex){
			
		}catch(TaxNotEligibleException ex){
			
		}
		finally{
			return tax;
		}
		
	}
}
