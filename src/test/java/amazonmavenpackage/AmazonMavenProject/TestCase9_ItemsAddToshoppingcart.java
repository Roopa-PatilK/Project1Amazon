package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class TestCase9_ItemsAddToshoppingcart extends BaseClass {
	
	@Test
	//(retryAnalyzer=retryFailedTestCase.class)
	public void addToCart()
	{
		HomePage homepage=new HomePage(driver);
		homepage.searchProduct2();
		
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.firstProductClick();
		
		AddToCartPage addtocart=new AddToCartPage(driver);
		addtocart.addtocartbtnforitem2();
		homepage.searchProduct();
		searchresult.firstProductClick();
		addtocart.addtocartbtnforitem3();
	}

}
