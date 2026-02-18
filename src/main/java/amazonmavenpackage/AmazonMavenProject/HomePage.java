package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class HomePage {
	SoftAssert s1=new SoftAssert();
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountnlists;
	
	public void hoverOver(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(accountnlists));
		a1.moveToElement(accountnlists).perform();
	}
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signinbtninhomepage;
	@FindBy(name="email")
	WebElement username;
	public void homepagesignin()
	{
		signinbtninhomepage.click();
		s1.assertEquals(username.isDisplayed(), true);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbar;
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-tall-aspect']")
	List<WebElement> productcount;
	public void searchProduct()
	{
		searchbar.sendKeys("toys"+Keys.ENTER);
		s1.assertEquals(productcount.size()>20, true);
	}
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[4]")
	WebElement brandnameselect;
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-tall-aspect']")
	List<WebElement> Brandcount;
	public void BrandSelection() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(brandname));
		
		brandnameselect.click();
		System.out.println("Product count:"+Brandcount.size());
		s1.assertEquals(Brandcount.size()>20, true);
	}
	@FindBy(xpath="//div[@class='a-row a-size-base a-color-secondary']")
	WebElement brandname;
	public void brandNameDisplay()
	{
		System.out.println("The selected brand is:"+brandname.getText());
	}
	public void searchProduct2()
	{
		String name="realme NARZO 80x 5G (Deep Ocean,8GB+128GB)";
		searchbar.sendKeys(name+Keys.ENTER);
		s1.assertEquals(productcount.size()>20, true);
	}
	@FindBy(xpath="//h2/parent::a")
	List<WebElement> allproducts;
	public void selectMatchingProduct()
	{
		
		String name="realme NARZO 80x 5G (Deep Ocean,8GB+128GB)";
		for(WebElement product:allproducts)
		{
			String productname=product.getText().trim();
			System.out.println(productname);
			if(productname.contains(name));
			{
				product.click();
				break;
			}
			
			
		}
	}
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
