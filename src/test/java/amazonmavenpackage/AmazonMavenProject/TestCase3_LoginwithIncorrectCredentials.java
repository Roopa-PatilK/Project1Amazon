package amazonmavenpackage.AmazonMavenProject;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(ITestListenerLogic.class)
public class TestCase3_LoginwithIncorrectCredentials extends BaseClass{
	
	@Test(retryAnalyzer=retryFailedTestCase.class)

	public void Launch() throws EncryptedDocumentException, IOException
	{
		ExcelSheetProgram excelsheet=new ExcelSheetProgram();
		excelsheet.ExcelData1();
		LoginPage login=new LoginPage(driver);
		login.username();
		login.continuebtnclick();
		login.wrongpassword();
		login.signinBtnClick1(driver);
		
	
	}
}
