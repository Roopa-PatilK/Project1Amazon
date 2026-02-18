package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerLogic implements ITestListener{
	
	public static WebDriver driver;
	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\User\\eclipse-workspace\\AirlneMavenProject\\Successscreenshots\\screenshot"+result.getTestClass()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}

	

