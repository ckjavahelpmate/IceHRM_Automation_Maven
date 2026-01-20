package tests.brwserlaunch;

import org.testng.annotations.Test;

import utility.BaseClass;

public class SocilaMediaTest extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void facebookTest() throws InterruptedException {

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	}


}
