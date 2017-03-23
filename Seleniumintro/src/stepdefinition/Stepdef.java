package stepdefinition;

import cucumber.api.java.en.Given;

public class Stepdef {

	
	@Given("I work in ([^\"]*)")
	public void work(String str){
		if(str.equals("Latenights"))
			System.out.println("latenights test");
		if(str.equals("Mornings"))
			System.out.println("morning test");
	}
}
