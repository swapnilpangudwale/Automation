package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.TendablePOM;
import UtilityClases.BaseClass;

public class TendableTestCases extends BaseClass{
	
	String fullName="swapnil pangudwale";
	String orgName = "SA Techologies";
	String phoneNo = "9028293050";
	String emailId ="pangudwales05@gmail.com";
	
	

	
	@Test(priority = 1)
	public void accessibility_of_the_Our_Story_menus() throws InterruptedException
	{
		TendablePOM tpom = new TendablePOM(driver);

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		tpom.openOurStory_MainMenu();
		
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='text-xl lg:text-3xl xl:text-4xl px-6 md:px-12 lg:px-16 xl:px-20 pt-20 font-serif']"))); 
		
		String acutalText = driver.findElement(By.xpath("(//h3[@class='text-xl lg:text-3xl xl:text-4xl px-6 md:px-12 lg:px-16 xl:px-20 pt-20 font-serif'])[1]")).getText();
		
		Assert.assertEquals(acutalText, "Our Vision");
		
		tpom.requestDemo();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bookDemo"))); 
		
		boolean bookDemoPresent = driver.findElement(By.id("bookDemo")).isDisplayed();
		
		Assert.assertTrue(bookDemoPresent);
		

	
	}
	
	@Test(priority = 2)
	public void accessibility_of_the_Our_Solution_menus() throws InterruptedException
	{
		TendablePOM tpom = new TendablePOM(driver);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		tpom.openOurSolution_MainMenu();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@style='text-align:center;'])[1]"))); 
		
		String ActualText = driver.findElement(By.xpath("(//h2[@style='text-align:center;'])[1]")).getText();
		
		Assert.assertEquals(ActualText, "Raise actions");
		
		
		
	tpom.requestDemo();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bookDemo"))); 
		
		boolean bookDemoPresent = driver.findElement(By.id("bookDemo")).isDisplayed();
		
		Assert.assertTrue(bookDemoPresent);

	
	}
	
	
	
	@Test(priority = 3)
	public void accessibility_of_the_Why_Tendable_menus() throws InterruptedException
	{
		TendablePOM tpom = new TendablePOM(driver);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		tpom.openWhyTendable_MainMenu();
		
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@style='text-align:center;'])[1]"))); 
		
		String ActualText = driver.findElement(By.xpath("(//h2[@style='text-align:center;'])[1]")).getText();
		
		Assert.assertEquals(ActualText, "Why should you choose Tendable?");
		
		//(//h2[@style='text-align:center;'])[2]

		
	tpom.requestDemo();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bookDemo"))); 
		
		boolean bookDemoPresent = driver.findElement(By.id("bookDemo")).isDisplayed();
		
		Assert.assertTrue(bookDemoPresent);
	
	}
	
	
	@Test(priority = 4)
	public void accessibility_of_the_Home_menu() throws InterruptedException
	{
		TendablePOM tpom = new TendablePOM(driver);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		tpom.openHome_MainMenu();
		
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@style='text-align:center;'])[2]"))); 
		
		String ActualText = driver.findElement(By.xpath("(//h2[@style='text-align:center;'])[2]")).getText();
		
		Assert.assertEquals(ActualText, "What is Tendable?");
	
	//	(//a[@href='https://www.tendable.com/book-a-demo'])[2]
		
				tpom.requestDemo();
	
				
				//bookDemo
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bookDemo"))); 
				
				boolean bookDemoPresent = driver.findElement(By.id("bookDemo")).isDisplayed();
				
				Assert.assertTrue(bookDemoPresent);
	
	}

	
	@Test(priority =5)
	public void contactUs() throws InterruptedException
	{
		TendablePOM tpom = new TendablePOM(driver);
		tpom.contactUsMethod();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='body-button bg-plain-600 toggle-control'])[1]"))); 
		
		tpom.MarketingMethod();
		
		
		tpom.enterFullName(fullName);
		
		tpom.enterOrgnizationName(orgName);
		
		tpom.enterPhoneNo(phoneNo);
		tpom.enterEmail(emailId);
		
		tpom.selectJobRole();
		
		tpom.SelectAgreeRadioBtn();
		
		tpom.SubmitBtn();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ff-form-errors']"))); 
		
		
		boolean errortxt = driver.findElement(By.xpath("//div[@class='ff-form-errors']")).isDisplayed();
		
		Assert.assertTrue(errortxt);
		
		
	}
	
	
	
}
