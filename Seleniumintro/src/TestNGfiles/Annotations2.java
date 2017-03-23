package TestNGfiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Annotations2 {

	@AfterSuite
	public void method3(){
		System.out.println("i have least priority");
	}
	@BeforeSuite
	public void method(){
		System.out.println("I am first to execute");
	}
/*	@Test
//	@Parameters({"userid"})
	public void parameterized(String userid){
		System.out.println(userid);
	}*/
}
