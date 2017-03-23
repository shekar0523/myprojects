package base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j_demo {

	public static void main(String[] args) {
		Logger log=Logger.getLogger("Log4j_demo");
		PropertyConfigurator.configure("E:\\QA\\workspace\\git\\Seleniumintro\\log4j.properties");
		WebDriver driver= new FirefoxDriver();
		log.info("driver setup sucessfull");
		driver.get("http://gmail.com");
		log.info("browser invokred");
		try{
			driver.findElement(By.id("mail")).sendKeys("xxxx@xxxx.xxx");
			log.info("email has entered");
		}catch(Exception e){
			log.error("no element has been found with Locator");
		}
	}

}
