package amazonmavenpackage.AmazonMavenProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerLogic.class)
public class TestCase13_ApplyCoupon extends BaseClass{
		
	@Test
	//(retryAnalyzer=retryFailedTestCase.class)
	public void ApplyCoupons() throws EncryptedDocumentException, IOException
	{
		ExcelSheetProgram excelsheet=new ExcelSheetProgram();
		excelsheet.ExcelData1();
		HomePage homepage=new HomePage(driver);
		homepage.hoverOver(driver);
		homepage.homepagesignin();
		
		LoginPage login=new LoginPage(driver);
		login.username();
		login.continuebtnclick();
		login.password();
		login.signinBtnClick(driver);
		
		homepage.searchProduct2();
		homepage.selectMatchingProduct();
		//SearchResultPage searchresult=new SearchResultPage(driver);
		
		//searchresult.firstProductClick();
		
		Couponspage cp=new Couponspage(driver);
		//cp.couponTag();
		cp.coupon();
	}
}
