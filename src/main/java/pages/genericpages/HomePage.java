package pages.genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	Locators
	private By projectLink = By.xpath("//a[ contains(text(), 'Projects')]");
	
	private By clientLink = By.xpath("//i[ @class='fa fa-user-circle']");
 	
	private By employeesMenu = By.xpath("//li[ @ref='admin_Employees']") ;
	private By employeesLink = By.id("admin_Employees") ;
	
	
//	Actions
	
	public void clickOnProjectLink() 
	{
		driver.findElement(projectLink).click();
	}
	
	public void clickOnEmployeeMenu() {
		driver.findElement(employeesMenu).click();
	}
	
	public void clickOnEmployeeLink() {
		driver.findElement(employeesLink).click();
	}
	
	public void clickOnClientLink() {
		driver.findElement(clientLink).click();
	}
}
