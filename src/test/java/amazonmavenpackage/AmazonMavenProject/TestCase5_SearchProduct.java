package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class TestCase5_SearchProduct extends BaseClass{
	@Test//(retryAnalyzer=retryFailedTestCase.class)
	public void SearchingProduct()
	{
		
		HomePage homepage=new HomePage(driver);
		homepage.searchProduct();
		
		SearchResultPage search=new SearchResultPage(driver);
		search.firstProductClick();
		
		AddToCartPage addtocart=new AddToCartPage(driver);
		addtocart.addToCartClick();
	}

}
