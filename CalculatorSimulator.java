package com.custom.exceptions;

public class CalculatorSimulator {

	public static void main(String[] args) {
		
		double tax;
		
		TaxCalculator T1 = new TaxCalculator();
		//test Case 1
		T1.empName = "Ron";
		T1.isIndian = false;
		T1.empSal = 34000;
		tax=T1.calculateTax();
		if(tax>0)
			System.out.println("Tax amount is "+tax);
		
		//test Case 2
		T1.empName = "Tim";
		T1.isIndian = true;
		T1.empSal = 1000;
		tax=T1.calculateTax();
		if(tax>0)
			System.out.println("Tax amount is "+tax);
		
		//test Case 3
		T1.empName = "Jack";
		T1.isIndian = true;
		T1.empSal = 55000;
		tax=T1.calculateTax();
		if(tax>0)
			System.out.println("Tax amount is "+tax);
		
		//test case 4
		T1.empName = null;
		T1.isIndian = true;
		T1.empSal = 30000;
		tax=T1.calculateTax();
		if(tax>0)
			System.out.println("Tax amount is "+tax);
	}

}
