package pages.adminpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage {
	private WebDriver driver;

	public ProjectPage(WebDriver driver) {
		this.driver = driver;
	}

//	Project Page Locators
	private By addNewButton = By.xpath("//span[ contains( text(), 'Add New')]");
	private By nameTextfield = By.id("name");
	private By statusSearchfield = By
			.xpath("//div[ text()='Status']/ancestor::div[ @class='ant-row ant-form-item-row']/descendant::input");
	private By saveButton = By.xpath("//span[ text()='Save']");

	// Delete confirm modal locators
	private By confirmDeleteButton = By.xpath("//button[ text()='Delete']");

//	Project Page Actions
	public void clickOnAddNewButton() {
		driver.findElement(addNewButton).click();
	}

	public void addProject(String projectName, String projectStatus) {
		driver.findElement(nameTextfield).sendKeys(projectName);
		driver.findElement(statusSearchfield).sendKeys(projectStatus, Keys.ENTER);
		driver.findElement(saveButton).click();
	}

	public void enterProjectStatus(String projectStatus) {
		driver.findElement(statusSearchfield).sendKeys(projectStatus, Keys.ENTER);
	}

	public void clickOnSaveButton() {
		driver.findElement(saveButton).click();
	}

	public void clickOnConfirmDeleteButton() {
		driver.findElement(confirmDeleteButton).click();
	}

	public void clickOnViewButton(String projectName) {
		driver.findElement(By.xpath(
				"//td[ text()='" + projectName + "']/following-sibling::td[2]/descendant::span[ text()=' View']"))
				.click();
	}

	public void clickOnEditButton(String projectName) {
		driver.findElement(By
				.xpath("//td[text()='" + projectName + "']/following-sibling::td[2]/descendant::span[ text()=' Edit']"))
				.click();
	}

	public void clickOnDeleteButton(String projectName) throws InterruptedException {
		driver.findElement(By.xpath(
				"//td[text()='" + projectName + "']/following-sibling::td[2]/descendant::span[ text()=' Delete']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(confirmDeleteButton).click();
	}
}
