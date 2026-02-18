package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import amazonmavenpackage.AmazonMavenProject.BaseClass;

public class screenshotForfailedTestCases1 extends BaseClass
{
	public static WebDriver driver;
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\User\\eclipse-workspace\\AirlneMavenProject\\Successscreenshots\\screenshot"+Math.random()+".png");
	
	
	

}


