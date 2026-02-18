package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class TestCase15_CartPageWithoutLogin extends BaseClass{

	@Test(retryAnalyzer=retryFailedTestCase.class)
	public void withoutLoginReachCartPage()
	{
		HomePage homepage=new HomePage(driver);
		homepage.searchProduct();
		
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.firstProductClick();
		
		AddToCartPage addToCartPage=new AddToCartPage(driver);
		addToCartPage.addToCartClick();
		addToCartPage.cartIconClick();
		
	}
}
