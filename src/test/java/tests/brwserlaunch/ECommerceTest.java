package tests.brwserlaunch;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import listeners.MyListener;
import utility.BaseClass;
import utility.ExtentReportManager;

@Listeners(MyListener.class)
public class ECommerceTest extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void amazonTest() throws InterruptedException {

		driver.get("https://www.amazon.com");
		ExtentReportManager.getTest().log(Status.INFO	, "Amzon home page displayed");
		Thread.sleep(2000);
		ExtentReportManager.getTest().log(Status.INFO	, "Waited for 2000ms");
		
		
	}
	
	@Test(groups = { "Regression" })
	public void flipkartTest() throws InterruptedException {

		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		System.err.println("\t\t\t\tflipkartTest");
	}

}
