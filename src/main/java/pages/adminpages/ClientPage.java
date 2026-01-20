package pages.adminpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ClientPage {
	private WebDriver driver;

	public ClientPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	// Locators
	private By addNewButton = By.xpath("//span[ text()=' Add New']");
	private By nameTextfield = By.id("name");
	private By statusTextfield = By
			.xpath("//div[text()='Status']/ancestor::div[@class='ant-row ant-form-item-row']/descendant::input");
	private By saveButton = By.xpath("//span[ text()='Save']");
	private By confirmDeleteButton = By.xpath("//button[ text()='Delete']");

//	Actions
	public void clickOnAddNewButton() {
		driver.findElement(addNewButton).click();
	}

	public void enterClientDetails(String name, String status) {
		driver.findElement(nameTextfield).sendKeys(name);
		driver.findElement(statusTextfield).sendKeys(status, Keys.ENTER);
		driver.findElement(saveButton).click();
	}

	public void clickOnDeleteButton(String clientName) {
		driver.findElement(By.xpath(
				"//td[text()='" + clientName + "']/following-sibling::td[4]/descendant::span[ text()=' Delete']"))
				.click();
	}

	public void clickOnConfirmDeleteButton() {
		driver.findElement(confirmDeleteButton).click();
	}
}
