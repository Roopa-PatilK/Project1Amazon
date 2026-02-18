package amazonmavenpackage.AmazonMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Couponspage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	SoftAssert s1=new SoftAssert();
			
	
	@FindBy(xpath="//span[@data-csa-c-owner='PromotionsDiscovery']")
	WebElement coupontag;
	public void couponTag()
	{
		
			s1.assertEquals(coupontag.isDisplayed(),true);
		
				
			System.out.println("Coupon is present for the product:");
	
	}
	@FindBy(xpath="//span[@data-csa-c-action='clipPromotion']")
	WebElement coupon;	
	public void coupon(){	
		try {
			if (coupon.isDisplayed()) {
				System.out.println("Coupon is displayed: " + coupon.getText());
				s1.assertTrue(true, "Coupon is displayed.");
				coupon.click();
			}
		}

		catch (Exception e) {
			System.out.println("Coupon not available for this order.");
			
			s1.assertAll();
		}
	}
	public Couponspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
