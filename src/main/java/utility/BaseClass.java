package utility;

import java.util.logging.LogManager;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	static {
		LogManager.getLogManager().reset();
	}

	protected WebDriver driver;

	@Parameters("browser")
	@BeforeMethod( alwaysRun = true)
	public void beforeMethod(@Optional("chrome") String browser) 
	{
		WebDriver driver ;
		
		switch( browser.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver(); break ;
		case "msedge" : driver = new EdgeDriver(); break ;
		case "firefox" : driver = new FirefoxDriver(); break ;
		default : throw new InvalidArgumentException(browser + " is invalid");
		
		}
		
		driver.manage().window().maximize();
		DriverManager.setDriver(driver);
		this.driver = DriverManager.getDriver();
	}

	@AfterMethod( alwaysRun = true)
	public void afterMethod() 
	{
		DriverManager.closeDriver();
		
	}

}
