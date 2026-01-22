package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utility.ExtentReportManager;
import utility.ScreenshotUtil;

public class MyListener implements ITestListener
{
	@Override
	public void onStart(ITestContext context) 
	{
		ExtentReportManager.createExtentReport();
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
//		Get the extent report
		ExtentReports extentReport = ExtentReportManager.createExtentReport();
//		Create test in report
		ExtentTest test = extentReport.createTest(result.getName());
//		add test to thread local
		ExtentReportManager.setTest(test);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
//		Get the test from thread local
		ExtentTest test = ExtentReportManager.getTest();
//		log the status
		test.log(Status.PASS, result.getName() + " test case is passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		ScreenshotUtil.takeScreenshot(result.getName());
//		Get the test from thread local
		ExtentTest test = ExtentReportManager.getTest();
//		log the status
		test.log(Status.FAIL, result.getThrowable() );
	}
	
	@Override
	public void onFinish(ITestContext context) 
	{
//		flush the report dashboard to webpage doc
		ExtentReportManager.flushreport();
	}
}
