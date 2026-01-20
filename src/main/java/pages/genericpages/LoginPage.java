package pages.genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver ;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
	}
//	 Locators of Login page
	private By usernameTextfield = By.id("username") ;
	private By passwordTextfield = By.id("password");
	private By loginButton = By.xpath("//button[ contains( text() , 'Log in')] ");
	
	
//	Actions of login page
	public void loginToApplication(String username, String password) 
	{
		driver.findElement(usernameTextfield).sendKeys(username);
		driver.findElement(passwordTextfield).sendKeys(password);
		driver.findElement(loginButton).click();
		
	}
}
