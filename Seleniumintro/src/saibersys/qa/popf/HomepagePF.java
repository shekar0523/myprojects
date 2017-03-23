package saibersys.qa.popf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePF {
	WebDriver driver;
	public HomepagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   
  @FindBy(id="srchword")
  WebElement search;
  
  @FindBy(xpath="//input[@type='submit']")
  WebElement submit;
  
  public WebElement Search(){
    	return search;
  }
   
  public WebElement Submit(){
    	return submit;
  } 	
}
