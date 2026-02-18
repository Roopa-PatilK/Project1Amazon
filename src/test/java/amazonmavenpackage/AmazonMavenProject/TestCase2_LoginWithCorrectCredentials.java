package amazonmavenpackage.AmazonMavenProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerLogic.class)
public class TestCase2_LoginWithCorrectCredentials extends BaseClass {
	
	
		@Test(retryAnalyzer=retryFailedTestCase.class)
 		public void Login() throws EncryptedDocumentException, IOException
 		{
			
			ExcelSheetProgram excelsheet=new ExcelSheetProgram();
			excelsheet.ExcelData1();
			HomePage homepage=new HomePage(driver);
			homepage.hoverOver(driver);
			homepage.homepagesignin();
			
		
			
			LoginPage login=new LoginPage(driver);
			
			login.username();
			//login.username(un);
			login.continuebtnclick();
			login.password();
			//login.password(pwd);
			login.signinBtnClick(driver);
	}

}

