package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryLogic  implements IRetryAnalyzer
{
	private int retryCount = 1 ;
	private static int maxTry = 2 ;
	@Override
	public boolean retry(ITestResult arg0) 
	{
		if( retryCount <= maxTry )
		{
			retryCount++;
			return true ;
		}
		return false;
	}
}
