package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class AddToCartPage {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	SoftAssert s1=new SoftAssert();
	JavascriptExecutor js;
	
	@FindBy(xpath="(//span[.=' Buy Now '])[3]")
	WebElement Buynowbtn;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocartbtn1;
	//@FindBy(xpath="//input[@id='add-to-cart-button']")
	//WebElement addtocartbtn1;
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	WebElement addtocartbtn2;
	public void addToCartClick()
	{
		Set<String> window=driver.getWindowHandles();
		System.out.println(window);
		
		Iterator<String> i1=window.iterator();
		String parentid=i1.next();
		String childid=i1.next();
		
		driver.switchTo().window(childid);
		js.executeScript("window.scrollBy(0,1000)");
		s1.assertEquals(addtocartbtn1.isDisplayed(), true);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
		//wait.until(ExpectedConditions.visibilityOf(addtocartbtn1));
		
		addtocartbtn1.click();
		s1.assertAll();
	}
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement proceedbtn;
	public void proceedToBuyBtn()
	{
		s1.assertEquals(proceedbtn.isDisplayed(), true);
		proceedbtn.click();
	}
	public void addtocartbtnforitem2()
	{
		wait.until(ExpectedConditions.visibilityOf(addtocartbtn2));
		addtocartbtn2.click();
	}
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocartbtn3;
	public void addtocartbtnforitem3()
	{
		wait.until(ExpectedConditions.visibilityOf(addtocartbtn3));
		addtocartbtn3.click();
	}
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement carticon;
	public void cartIconClick()
	{
		wait.until(ExpectedConditions.visibilityOf(carticon));
		s1.assertEquals(carticon.isDisplayed(), true);
		carticon.click();
	}
	@FindBy(xpath="//h2[@id='sc-active-items-header']")
	WebElement shoppingcarttxt;
	public void shoppingCartText()
	{
		s1.assertEquals(shoppingcarttxt.getText(), "Shopping Cart");
		Reporter.log("Landed on Shopping cart page");
	}
	@FindBy(xpath="//span[@data-a-selector='increment-icon']")
	WebElement plusicon;
	public void clickPlusicon() 
	{
		plusicon.click();
	}
	@FindBy(xpath="//fieldset[@class='a-declarative']")
	WebElement increamentQuantity;
	public void verifyQuantityincreased() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(increamentQuantity));
		Thread.sleep(2000);
		s1.assertEquals(increamentQuantity.getText(), 2);
		System.out.println(increamentQuantity.getText());
	
	}
	@FindBy(xpath="//button[@data-a-selector='increment']")
	WebElement plusicon1;
	public void clickPlusicon1() throws InterruptedException 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(plusicon));
		//wait.until(ExpectedConditions.visibilityOf(plusicon1));
		Thread.sleep(2000);
		plusicon1.click();
	}
	public void verifyQuantityincreased1() throws InterruptedException
	{
		Thread.sleep(2000);
		s1.assertEquals(increamentQuantity.getText(), 3);
		System.out.println(increamentQuantity.getText());
		
	}
	@FindBy(xpath="//button[@data-a-selector='decrement']")
	WebElement removeitem;
	public void removeItemfromTheCart() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(removeitem));
		Thread.sleep(2000);
		removeitem.click();
		s1.assertEquals(increamentQuantity.getText(), 2);
		
	}
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		this.js=(JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
		s1.assertAll();
	}
	

}
