package tests.brwserlaunch;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.MyListener;
import utility.BaseClass;

@Listeners(MyListener.class)
public class JavaIdeTest extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void eclipseTest() throws InterruptedException {

		driver.get("https://www.eclipse.org/");
		Thread.sleep(2000);
	}

	@Test(groups = { "Regression" })
	public void jetBrainsTest() throws InterruptedException {

		driver.get("https://www.jetbrains.com/idea/");
		Thread.sleep(2000);
	}

}
