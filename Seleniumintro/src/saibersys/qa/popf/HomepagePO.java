package saibersys.qa.popf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePO {
	WebDriver driver;
	public HomepagePO(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.id("srchword");
	By submit=By.xpath("//input[@type='submit']");
	
	
  public WebElement Search(){
    	return driver.findElement(search);
  }
   
  public WebElement Submit(){
    	return driver.findElement(submit);
  }
	
}
