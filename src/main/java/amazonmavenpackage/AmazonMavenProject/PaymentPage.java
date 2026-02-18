package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class PaymentPage {
	
	WebDriver driver;	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
	SoftAssert s1=new SoftAssert();
	@FindBy(id="nav-checkout-title-header-text")
	WebElement securecheckout;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement amazonpaybalance;
	public void verifysecureCheckouttext()
	{
		wait.until(ExpectedConditions.visibilityOf(securecheckout));
		s1.assertEquals(securecheckout.isDisplayed(), true);
	}
	public void amazonPaybalancecheck()
	{
		amazonpaybalance.click();
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement amazonpay;
	public void amazonPaycheck()
	{
		amazonpay.click();
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement debitandcreditcard;
	public void debitAndCreditcardcheck()
	{
		debitandcreditcard.click();
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
	WebElement netbanking;
	public void newBankingcheck()
	{
		netbanking.click();
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[7]")
	WebElement upiapps;
	public void upiAppscheck()
	{
		upiapps.click();
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[8]")
	WebElement emi;
	public void emicheck()
	{
		emi.click();
	}
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[9]")
	WebElement cashondelivery;
	public void cashOnDeliverycheck()
	{
		cashondelivery.click();
	}
	@FindBy(xpath="//input[@data-testid='bottom-continue-button']")
	WebElement usethispaymentmethod;
	public void useThisPaymentMethod()
	{
		usethispaymentmethod.click();
	}
	@FindBy(xpath="(//a[@data-frompage='payselect'])[2]")
	WebElement revieworder;
	public void clickReviewOrder()
	{
		revieworder.click();
	}
	@FindBy(xpath="(//input[@name='placeYourOrder1'])[3]")
	WebElement placeyourorder;
	public void verifyPlaceyourorderbutton()
	{
		s1.assertEquals(placeyourorder.isDisplayed(), true);
		Reporter.log("Review order page is loaded");
	}
	@FindBy(xpath="//i[@class='a-icon a-icon-close']")
	WebElement closeicon;
	@FindBy(xpath="(//input[@name='placeYourOrder1'])[1]")
	WebElement paywithamazonpayupi;
	public void clickCloseIcon()
	{
		wait.until(ExpectedConditions.visibilityOf(closeicon));
		closeicon.click();
		s1.assertEquals(paywithamazonpayupi.isDisplayed(), true);
	}
	

	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
