package amazonmavenpackage.AmazonMavenProject;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class RegistrationPage{
	
	WebDriver driver;
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert s1=new SoftAssert();
	@FindBy(name="email")
	WebElement username;
	public void un() throws EncryptedDocumentException, IOException 
	{
		username.sendKeys("8970222657");
	}
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebtninloginpage;
	public void continuebtn()
	{
		continuebtninloginpage.click();
	}
	@FindBy(xpath="//input[@type='submit']")
	WebElement createanaccount;
	public void createAnAccount() throws InterruptedException
	{
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(createanaccount));
		createanaccount.click();
	}
	@FindBy(xpath="//h1[@class='a-spacing-small moa_desktop_signup']")
	WebElement verifycreateanaccountpage;
	public void verifyCreateanAccountPage()
	{
		s1.assertTrue(true, "Create Account");
	}
	@FindBy(id="ap_customer_name")
	WebElement customername;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="auth-continue")
	WebElement verifymobilenumber;
	@FindBy(xpath="//h1[.='Verify mobile number']")
	WebElement verifymobilenumberpage;
	@FindBy(xpath="//input[@name='code']")
	WebElement enterotp;
	@FindBy(xpath="//input[@aria-label='Verify OTP Button']")
	WebElement createyouramazonaccount;
	public void enterCustomerDetails() throws InterruptedException
	{
		customername.sendKeys("Soumya");
		password.sendKeys("Roopa@123");
		verifymobilenumber.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(verifymobilenumberpage));
		s1.assertEquals(verifymobilenumberpage.isDisplayed(), true);
		enterotp.sendKeys("12324");
		createyouramazonaccount.click();
		s1.assertAll();
	}
	
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
