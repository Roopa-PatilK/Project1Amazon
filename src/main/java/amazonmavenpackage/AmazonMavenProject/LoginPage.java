package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginPage extends ExcelSheetProgram{
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert s1=new SoftAssert();
	@FindBy(name="email")
	WebElement un;
	public void username()
	{
		wait.until(ExpectedConditions.visibilityOf(un));
		un.sendKeys(username);
	}
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continuebtn;
	public void continuebtnclick()
	{
		continuebtn.click();
	}
	
	@FindBy(id="ap_password")
	WebElement pwd;
	public void password() 
	{
		wait.until(ExpectedConditions.visibilityOf(pwd));
		s1.assertEquals(pwd.isDisplayed(), true);
		pwd.sendKeys(password);
		
	}
	public void wrongpassword() 
	{
		wait.until(ExpectedConditions.visibilityOf(pwd));
		s1.assertEquals(pwd.isDisplayed(), true);
		pwd.sendKeys("Krishiv@1234");
		
	}
	@FindBy(id="signInSubmit")
	WebElement signinbtnloginpage;
	
	public void signinBtnClick(WebDriver driver)
	{
		signinbtnloginpage.click();
		s1.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		s1.assertAll();
		//driver.switchTo().alert().dismiss();//ask Manish
	}
	@FindBy(xpath="(//div[@class='a-alert-content'])[1]")
	WebElement alertmsg;
	public void signinBtnClick1(WebDriver driver)
	{
		signinbtnloginpage.click();
		s1.assertEquals(alertmsg.getText(), "Your password is incorrect","entered password is wrong");
		s1.assertAll();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
