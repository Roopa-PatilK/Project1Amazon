package amazonmavenpackage.AmazonMavenProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class TestCase14_FiveStarRating extends BaseClass{
	
	@Test//(retryAnalyzer=retryFailedTestCase.class)
	public void Rating() throws EncryptedDocumentException, IOException
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
		
		homepage.hoverOver(driver);
		
		YourOrdersPage yourorders=new YourOrdersPage(driver);
		yourorders.yourOrdersClick();
		yourorders.writeProductReview();
		yourorders.writeReviewTextbox();
		yourorders.selectStart();
		yourorders.uploadPhoto();
		//yourorders.submitReview();
	}
	

}
