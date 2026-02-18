package amazonmavenpackage.AmazonMavenProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerLogic.class)
public class TestCase1_Registration extends BaseClass{
	@Test
	public void Register() throws EncryptedDocumentException, IOException, InterruptedException {
		//ExcelSheet excelsheet=new ExcelSheet();
		
		HomePage homepage=new HomePage(driver);
		homepage.hoverOver(driver);
		homepage.homepagesignin();
		//excelsheet.ExcelData();
		
		RegistrationPage register=new RegistrationPage(driver);
		register.un();
		register.continuebtn();
		register.createAnAccount();
		register.verifyCreateanAccountPage();
		register.enterCustomerDetails();
	}

}
