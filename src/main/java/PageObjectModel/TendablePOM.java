package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TendablePOM {

	
	
	WebDriver localDriver;
	public TendablePOM(WebDriver rdriver)
	{
		localDriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
//main menu locators  
	@FindBy(xpath="//a[@href='https://www.tendable.com/']")
	WebElement tendableHome;
	
	@FindBy(xpath="//a[@href='https://www.tendable.com/our-story']")
	WebElement ourStory;
	
	@FindBy(xpath="(//a[@href='https://www.tendable.com/our-solution'])[1]")
	WebElement ourSolution;
	
	@FindBy(xpath="(//a[@href='https://www.tendable.com/why-tendable'])[1]")
	WebElement whyTendable;
	
	
	@FindBy(xpath="(//a[@href='https://www.tendable.com/contact-us'])[2]")
	WebElement contactUs;
	
	
	@FindBy(xpath="(//a[@href='https://www.tendable.com/book-a-demo'])[2]")
	WebElement requestDemo;
	
	
	@FindBy(xpath="(//button[@class='body-button bg-plain-600 toggle-control'])[1]")
WebElement marketing;
	
	
	@FindBy(name ="fullName")
	WebElement fname;
		
		
	
	@FindBy(name="organisationName")
	WebElement orgName;
		
		
	
	@FindBy(name="cellPhone")
	WebElement phone;
	
	
	@FindBy(name="email")
	WebElement email;
	
	
	@FindBy(name="jobRole")
	WebElement jobRole;
	
	
	@FindBy(xpath="//option[@value='Other']")
	WebElement otherValue;	
	
	
	@FindBy(id="form-input-consentAgreed-0")
	WebElement agree;
	
	
	@FindBy(name="form_page_submit")
	WebElement submit;
	
	
	public void openHome_MainMenu() throws InterruptedException
	{

		tendableHome.click();

	}
	
	public void openOurStory_MainMenu() throws InterruptedException
	{

		ourStory.click();

	}
	
	
	
	public void openOurSolution_MainMenu() throws InterruptedException
	{

		ourSolution.click();

	}
	

	
	public void openWhyTendable_MainMenu() throws InterruptedException
	{

		whyTendable.click();

	}
	
	
	public void requestDemo() throws InterruptedException
	{

		requestDemo.click();

	}
	
	public void contactUsMethod() throws InterruptedException
	{

		contactUs.click();

	}
	
	public void MarketingMethod() throws InterruptedException
	{

		marketing.click();

	}
	
	
	public void enterFullName(String fnm) throws InterruptedException
	{

	fname.sendKeys(fnm);

	}
	
	
	
	public void enterOrgnizationName(String orgizationNm) throws InterruptedException
	{

	orgName.sendKeys(orgizationNm);

	}
	
	
	public void enterPhoneNo(String phone1) throws InterruptedException
	{

	phone.sendKeys(phone1);

	}
	
	
	public void enterEmail(String emilId) throws InterruptedException
	{

		email.sendKeys(emilId);

	}
	
	
	public void selectJobRole() throws InterruptedException
	{

		jobRole.click();
		otherValue.click();

	}
	
	public void SelectAgreeRadioBtn() throws InterruptedException
	{

		agree.click();

	}
	
	public void SubmitBtn()
	{
		submit.click();
	}
	
}
