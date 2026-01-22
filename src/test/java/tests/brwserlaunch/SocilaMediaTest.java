package tests.brwserlaunch;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.MyListener;
import utility.BaseClass;

@Listeners(MyListener.class)
public class SocilaMediaTest extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void facebookTest() throws InterruptedException {

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	}

	@Test(groups = { "Regression" })
	public void instagramTest() throws InterruptedException {

		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
	}

}
