package saibersys.qa.pageobject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import saibersys.qa.popf.HomepagePF;
import saibersys.qa.popf.HomepagePO;
import saibersys.qa.popf.LoginpagePF;
import saibersys.qa.popf.LoginpagePO;

public class TestPoPf {

	@Test
	public void LoginPO()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\QA\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		LoginpagePO rd=new LoginpagePO(driver);
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hello");
		//rd.submit().click();
		rd.Home().click();
		HomepagePO rh=new HomepagePO(driver);
		rh.Search().sendKeys("samsung");
		rh.Submit().click();
	}
	
	@Test
	public void LoginPF()
	{
	//	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginpagePF rd=new LoginpagePF(driver1);
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hello");
		//rd.submit().click();
		
		rd.Home().click();
		HomepagePF rh=new HomepagePF(driver1);
		rh.Search().sendKeys("apple");
		rh.Submit().click();
		
		
	}
	
}
