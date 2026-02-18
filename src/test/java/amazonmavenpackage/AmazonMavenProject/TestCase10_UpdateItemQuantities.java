package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class TestCase10_UpdateItemQuantities extends BaseClass {
	
	@Test
	public void updateItemsQuantity() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.searchProduct();
		
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.firstProductClick();
		
		AddToCartPage addtocart=new AddToCartPage(driver);
		addtocart.addToCartClick();
		addtocart.cartIconClick();
		addtocart.shoppingCartText();
		addtocart.clickPlusicon();
		addtocart.verifyQuantityincreased();
		addtocart.clickPlusicon1();
		addtocart.verifyQuantityincreased1();
		addtocart.removeItemfromTheCart();
		
	}
}
