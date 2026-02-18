package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class ProductDetailsPage {
	
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert s1=new SoftAssert();
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement productprice;
	@FindBy(xpath="//h2[text()='Product Description']")
	WebElement productdescription;
	@FindBy(xpath="//h3[@class='a-spacing-medium a-spacing-top-large']")
	WebElement productreview;
	public void verifyProductDetails() throws InterruptedException
	{
		s1.assertEquals(productprice.isDisplayed(), true);
		Reporter.log("Product price is displaying");
		System.out.println("Product price is displaying");
	Thread.sleep(2000);
	try
	{
		if(productdescription.isDisplayed())
		{
			Reporter.log("Product Description is displaying");
			System.out.println("Product Description is displaying");
		}
	}
		catch(Exception e)
		{
			Reporter.log("Product Description is not present");
			System.out.println("Product Description is not present");
		}
	try
	{
		if(productreview.isDisplayed())
		{
			Reporter.log("Product Reviews are displaying");
			System.out.println("Product Reviews are displaying");
		}
	}
	catch(Exception e)
		{
			Reporter.log("Product Reviews are not displaying");
			System.out.println("Product Reviews are not displaying");
		}
	}
	public ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
