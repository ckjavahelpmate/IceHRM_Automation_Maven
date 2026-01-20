package listeners;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ScreenshotUtil;

public class MyListener implements ISuiteListener, ITestListener
{
	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println(context.getName() +" test begin");
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println( result.getName() + " testcase started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println( result.getName() + " testcase passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println( result.getName() + " testcase failed");
		ScreenshotUtil.takeScreenshot(result.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println( context.getName() + " test completed");
	}
}
