package amazonmavenpackage.AmazonMavenProject;

import java.io.File;
import java.io.IOException;

import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ITestListenerLogic implements ITestListener {

	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case passed");
		System.out.println("Test case passed");
		
		Date d1=new Date();
		//return type of getTime() is long
		System.out.println(d1.getTime());//epoch time machine understandable time not human understandable time
		
		Date d2=new Date(d1.getTime());
		//System.out.println(d2);
		String format=d2.toString();
		String date=format.substring(8,10);
		String month=format.substring(4,7);
		String year=format.substring(24);
		String year1=format.substring(format.length()-4);
		String hour=format.substring(11,13);
		String min=format.substring(14,16);
		
		String format2=date.concat(" ").concat(month).concat(" ").concat(year1).concat(" ").concat(hour).concat(" ").concat(min);
		//System.out.println(format2);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		//TestCase1_Registration register=new TestCase1_Registration();
		File destination=new File("C:\\Users\\User\\eclipse-workspace\\AmazonMavenProject\\PassScreenshot\\screenshot" +result.getTestClass()+format2+".png");//by creating object and using getTestclass() method
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case Failed");
		System.out.println("Test case Failed");
		
		Date d1=new Date();
		//return type of getTime() is long
		System.out.println(d1.getTime());//epoch time machine understandable time not human understandable time
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String format=d2.toString();
		String date=format.substring(8,10);
		String month=format.substring(4,7);
		String year=format.substring(24);
		String year1=format.substring(format.length()-4);
		String hour=format.substring(11,13);
		String min=format.substring(14,16);
		
		String format2=date.concat(" ").concat(month).concat(" ").concat(year1).concat(" ").concat(hour).concat(" ").concat(min);
		System.out.println(format2);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		//TestCase1_Registration register=new TestCase1_Registration();
		File destination=new File("C:\\Users\\User\\eclipse-workspace\\AmazonMavenProject\\FailedScreenshot\\screenshot" +result.getName()+format2+".png");//by creating object and using getclass() method
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	
}
