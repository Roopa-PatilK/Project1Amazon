package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class ChangeAddressPage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert s1=new SoftAssert();
	@FindBy(xpath="//a[@aria-label='Change delivery address']")
	WebElement changetext;
	@FindBy(xpath="(//h2[@class='a-size-medium a-spacing-none a-text-bold'])[2]")
	WebElement selectdeliveryaddresspage;
	public void clickChangelink()
	{
		changetext.click();
		String text=selectdeliveryaddresspage.getText();
		System.out.println(text);
		//s1.assertEquals(selectdeliveryaddresspage.isDisplayed(),true);
		s1.assertAll();
	}
	@FindBy(xpath="(//i[@class='a-icon a-icon-radio'])[2]")
	WebElement selectaddess;
	public void selecrAddress()
	{
		wait.until(ExpectedConditions.visibilityOf(selectaddess));
		selectaddess.click();
	}
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement delivertothisaddress;
	public void deliverToThisAddresClick()
	{
		delivertothisaddress.click();
	}
	@FindBy(xpath="//span[@class='a-expander-prompt']")
	WebElement showmoreaddresses;
	public void clickShowMoreAddresses()
	{
		showmoreaddresses.click();
	}
	public ChangeAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
