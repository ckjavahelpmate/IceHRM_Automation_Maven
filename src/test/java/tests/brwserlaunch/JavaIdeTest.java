package tests.brwserlaunch;

import org.testng.annotations.Test;

import utility.BaseClass;

public class JavaIdeTest extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void eclipseTest() throws InterruptedException {

		driver.get("https://www.eclipse.org/");
		Thread.sleep(2000);
	}

}
