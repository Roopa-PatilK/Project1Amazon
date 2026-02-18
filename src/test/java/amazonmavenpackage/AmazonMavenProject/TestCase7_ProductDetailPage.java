package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ITestListenerLogic.class)
public class TestCase7_ProductDetailPage extends BaseClass{
	
	@Test
	//(retryAnalyzer=retryFailedTestCase.class)
	public void DetailPage() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.searchProduct();
		
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.firstProductClick();
		
		ProductDetailsPage productdetailpage=new ProductDetailsPage(driver);
		productdetailpage.verifyProductDetails();
	}

}
