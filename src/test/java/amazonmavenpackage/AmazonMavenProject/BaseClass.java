package amazonmavenpackage.AmazonMavenProject;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class BaseClass extends ITestListenerLogic{
	
//	SoftAssert s1=new SoftAssert();
	//@Parameters("browser")
	@BeforeMethod
	public void Launch() throws EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*	
	if(nameofbrowser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		if(nameofbrowser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		EdgeOptions options=new EdgeOptions();//invoked its constructor
		//options.addArguments("headless");//invoked non static method
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		driver=new EdgeDriver(options);//invoked chromedriver class parametrized constructor
		
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s1.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		s1.assertAll(); 
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
*/
	}
}
