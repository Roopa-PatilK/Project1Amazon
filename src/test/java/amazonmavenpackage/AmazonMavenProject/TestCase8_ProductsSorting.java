package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Test;

public class TestCase8_ProductsSorting extends BaseClass {
	@Test
	public void SortProducts() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.searchProduct();
		homepage.BrandSelection();
		homepage.brandNameDisplay();
		
		
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.priceRangeSelection(driver);
		searchresult.sortProducts();
}
}
