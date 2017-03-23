package TestNGfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Datadrivenframe {
	
	@Test
	public void Login() throws IOException, InterruptedException{
		Properties prop= new Properties();
		FileInputStream fil=new FileInputStream("E:\\QA\\workspace\\git\\Seleniumintro\\src\\TestNGfiles\\datadriven.properties");
		prop.load(fil);
		WebDriver driver=null;
		if(prop.getProperty("browser").equals("firefox"))
			driver=new FirefoxDriver();
		else if(prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver","E:\\QA\\jars\\chromedriver.exe");
			driver= new ChromeDriver();
		}else{
			System.setProperty("webdriver.ie.driver","E:\\QA\\jars\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}	
		
		driver.get(prop.getProperty("url"));
		
		System.out.println(prop.getProperty("username"));
	}
	
	
}
