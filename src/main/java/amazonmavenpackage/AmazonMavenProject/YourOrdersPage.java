package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class YourOrdersPage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert s1=new SoftAssert();
	
	@FindBy(xpath="//span[.='Your Orders']")
	WebElement yourorders;
	public void yourOrdersClick()
	{
		yourorders.click();
	}
	@FindBy(id="searchOrdersInput")
	WebElement searchordersbar;
	@FindBy(xpath="//a[contains(@href,'/review')]")
	WebElement writeproductreview;
	
	public void writeProductReview()
	{
		s1.assertEquals(searchordersbar.isDisplayed(), true);
		writeproductreview.click();
		s1.assertAll();
	}
	@FindBy(name="reviewText")
	WebElement writereviewtext;
	public void writeReviewTextbox()
	{
		s1.assertEquals(writereviewtext.isDisplayed(), true);
		writereviewtext.sendKeys("The product is very good");
		s1.assertAll();
	}
	@FindBy(xpath="(//span[@class='in-context-ryp__form-field--starRating-single'])[4]")
	WebElement starselect;
	public void selectStart()
	{
		starselect.click();
		wait.until(ExpectedConditions.visibilityOf(starselect));
		//s1.assertEquals(starselect.isSelected(), true);//ask Manish
		s1.assertAll();
	}
	@FindBy(xpath="//div[@aria-label='Share a video or photo']/child::img")
	WebElement photoclick;
	public void uploadPhoto()
	{
		wait.until(ExpectedConditions.elementToBeClickable(photoclick));
		//photoclick.click();
		photoclick.sendKeys("C:\\Users\\User\\Pictures\\IMG-20250330-WA0006.jpg");
		
	}
	
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement submit;
	public void submitReview()
	{
		submit.click();
	}
	public YourOrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
