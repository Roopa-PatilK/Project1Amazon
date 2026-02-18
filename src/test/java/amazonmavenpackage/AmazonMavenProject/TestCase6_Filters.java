package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class TestCase6_Filters extends BaseClass{
	@Test
	//(retryAnalyzer=retryFailedTestCase.class)
	public void brandCategorySelection() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.searchProduct();
		homepage.BrandSelection();
		homepage.brandNameDisplay();
		
		
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.priceRangeSelection(driver);
	}

}
