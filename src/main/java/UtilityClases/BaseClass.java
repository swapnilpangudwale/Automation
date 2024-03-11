package UtilityClases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	String baseURL = "https://www.tendable.com/";
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
		
		
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}
	
	
	



	
	
	

}
