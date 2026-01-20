package tests.brwserlaunch;

import org.testng.annotations.Test;

import utility.BaseClass;

public class ECommerceTest extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void amazonTest() throws InterruptedException {

		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		
		
	}

}
