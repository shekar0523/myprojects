package TestNGfiles;

import java.io.IOException;

import org.testng.annotations.*;

public class Annotations extends Datadrivenframe {
	
	
	
	@BeforeMethod
	public void userid(){
		System.out.println("execute before every test");
	}
	@BeforeTest
	public void deletecookies(){
		System.out.println("executes once before all tests");
	}
	@Test(groups={"priority1"})
	public void openingbrowser() throws IOException, InterruptedException{
		Login();
		System.out.println("opening broswer");
	}
	@Test(groups={"priority2"})
	public void flightcancel(){
		System.out.println("flight cancelled");
	}
	@Test(dependsOnMethods={"openingbrowser"},alwaysRun=true)
	public void flightticket(){
		System.out.println("Booking Tickets");
	}
	@Test(dependsOnMethods={"flightticket"},enabled=true)
	public void payment(){
		System.out.println("making Payment");
	}
	@Test(dependsOnMethods={"payment"},timeOut=45000)
	public void paymentverification(){
		System.out.println("Payment verification");
	}
	@AfterMethod
	public void method2(){
		System.out.println("executes after each test");
	}
	@AfterTest
	public void closingbrowser(){
		System.out.println("closes browser");
	}
	
}
