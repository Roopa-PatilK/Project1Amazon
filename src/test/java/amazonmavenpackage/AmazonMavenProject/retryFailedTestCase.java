package amazonmavenpackage.AmazonMavenProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryFailedTestCase implements IRetryAnalyzer {

	int retrycount=2;
	int initialcount=0;
	@Override
	public boolean retry(ITestResult result) 
	{
		
		if(initialcount<retrycount) 
		{
			initialcount++;
			return true;
		}
		return false;
		
	}

}
