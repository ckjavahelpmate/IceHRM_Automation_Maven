package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

	public static void takeScreenshot(String filename) 
	{
		WebDriver driver = DriverManager.getDriver();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File tgt = new File("./Screenshots/"+ filename +".png");
		
		try {
			FileHandler.copy(screenshotAs, tgt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
