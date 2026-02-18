package amazonmavenpackage.AmazonMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class YourAccountPage {
	
	
	WebDriver driver;
	SoftAssert s1=new SoftAssert();
	@FindBy(xpath="//span[.='Your Account']")
	WebElement youraccounttext;
	public void yourAccountTextClick()
	{
		youraccounttext.click();
	}
	@FindBy(xpath="//div[@class='a-row a-spacing-base']")
	WebElement youraccounttextmessage;
	@FindBy(xpath="(//div[@class='a-box ya-card--rich'])[4]")
	WebElement youraddressesbox;
	@FindBy(xpath="//div[@class='a-box first-desktop-address-tile']")
	WebElement addaddress;
	public void yourAddressesBoxClick()
	{
		s1.assertEquals(youraccounttextmessage.getText(), "Your Account");
		Reporter.log("Your Account box is present");
		youraddressesbox.click();
		s1.assertEquals(addaddress.isDisplayed(), true);
		Reporter.log("Add address box is present");
		s1.assertAll();
	}
	@FindBy(xpath="(//a[.='Edit                        '])[3]")
	WebElement edit;
	@FindBy(xpath="//h2[.='Edit your address']")
	WebElement edityouraddresspage;
	public void editAddress()
	{
		edit.click();
		s1.assertEquals(edityouraddresspage.getText(), "Edit your address");
		Reporter.log("Edit your address page");
		s1.assertAll();
	}
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement mobilenumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement address;
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement city;
	@FindBy(xpath="(//input[@type='submit'])[4]")
	WebElement updateaddress;
	public void editAlldetails()
	{
		fullname.clear();
		fullname.sendKeys("Roopa");
		mobilenumber.clear();
		mobilenumber.sendKeys("8970331627");
		address.clear();
		address.sendKeys("1994 B k Halli Ramadevar oni TQ:Haliyal Dist:Uttara Kannada Karnataka");
		city.clear();
		city.sendKeys("Haliyal");
		
	}
	@FindBy(xpath="//h4[.='Address saved']")
	WebElement successmessage;
	public void updateDetails()
	{
		updateaddress.click();
		s1.assertEquals(successmessage.getText(), "Address saved");
		Reporter.log("Address saved successfully");
		s1.assertAll();
	}
	
	public YourAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
