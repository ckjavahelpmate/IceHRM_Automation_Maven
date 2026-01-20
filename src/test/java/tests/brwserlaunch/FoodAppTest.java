package tests.brwserlaunch;

import org.testng.annotations.Test;

import utility.BaseClass;

public class FoodAppTest extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void SwiggyTest() throws InterruptedException {

		driver.get("https://www.swiggy.com");
		Thread.sleep(2000);
	}

}
