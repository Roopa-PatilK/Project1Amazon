package amazonmavenpackage.AmazonMavenProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class Testcase11_CheckoutProcess extends BaseClass{

	@Test
	public void checkoutProcess() throws EncryptedDocumentException, IOException
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
		homepage.searchProduct();
		
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.firstProductClick();
		
		AddToCartPage addtocart=new AddToCartPage(driver);
		addtocart.addToCartClick();
		addtocart.proceedToBuyBtn();
		
		PaymentPage paymentpage=new PaymentPage(driver);
		paymentpage.verifysecureCheckouttext();
		
		ChangeAddressPage changeaddress=new ChangeAddressPage(driver);
		changeaddress.clickChangelink();
		//changeaddress.clickShowMoreAddresses();
		changeaddress.selecrAddress();
		changeaddress.deliverToThisAddresClick();
		paymentpage.amazonPaycheck();
		paymentpage.useThisPaymentMethod();
		paymentpage.clickCloseIcon();
	
		
		//paymentpage.clickReviewOrder();
		//paymentpage.verifyPlaceyourorderbutton();
	}
}
