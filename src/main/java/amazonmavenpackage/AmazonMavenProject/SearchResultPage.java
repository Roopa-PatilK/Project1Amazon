package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class SearchResultPage {
	
	SoftAssert s1=new SoftAssert();
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement firstproduct;
	@FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
	WebElement allproducts;
	public void firstProductClick()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(allproducts));
		firstproduct.click();
	}
	@FindBy(xpath="//input[@aria-label='Maximum price']")
	WebElement drag;
	//@FindBy(xpath="//input[@aria-valuenow='45']")
	//WebElement pricerange2;
	@FindBy(xpath="//input[@aria-label='Go - Submit price range']")
	WebElement go;
	@FindBy(xpath="//div[@class='a-section a-spacing-base']")
	List<WebElement> productcount;
	
	public void priceRangeSelection(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1];arguments[0].dispatchEvent(new Event('change'));",drag,"50");
		//Actions a1=new Actions(driver);
		//a1.dragAndDrop(drag, pricerange2).perform();
		go.click();
		s1.assertEquals(productcount.size()>1, true,"product count not found 1");
		System.out.println("product count is:"+productcount.size());
	
	}
	
	@FindBy(xpath="//button[@aria-label='6']")
	WebElement size;
	@FindBy(xpath="(//div[@class='colorsprite aok-float-left'])[2]")
	WebElement color;
	
	@FindBy(xpath="//span[@class='a-size-small a-color-base']")
	WebElement customerreview;
	@FindBy(xpath="(//li[@class='a-spacing-micro s-navigation-indent-2'])[3]")
	WebElement category;
	public void sortProducts()
	{
		size.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(productcount));
		s1.assertEquals(productcount.size()>5, true,"product count not found 2");
		System.out.println("product count is:"+productcount.size());
		color.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(productcount));
		s1.assertEquals(productcount.size()>5, true,"product count not found 3");
		System.out.println("product count is:"+productcount.size());
		
			if(customerreview.isDisplayed())
			{
				customerreview.click();
				wait.until(ExpectedConditions.visibilityOfAllElements(productcount));
			}
			else
			{
				System.out.println("Customer review filter not available:");
			}
		
		
		s1.assertEquals(productcount.size()>2, true,"product count not found 4");
		System.out.println("product count is:"+productcount.size());
		category.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(productcount));
		s1.assertEquals(productcount.size()>5, true,"product count not found 5");
		System.out.println("product count is:"+productcount.size());
		s1.assertAll();
	}
	
	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
