package tests.brwserlaunch;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.MyListener;
import utility.BaseClass;

@Listeners(MyListener.class)
public class FoodAppTest extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void SwiggyTest() throws InterruptedException {

		driver.get("https://www.swiggy.com");
		Thread.sleep(2000);
	}
	
	@Test(groups = { "Regression" })
	public void ZomatoTest() throws InterruptedException {
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
	}

}
