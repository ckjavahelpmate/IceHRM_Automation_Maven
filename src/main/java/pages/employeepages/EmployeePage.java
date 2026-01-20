package pages.employeepages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EmployeePage {
	
	private WebDriver driver ;

	public EmployeePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
//	Employee Page Locators
	private By addNewEmployeeButton = By.xpath("//span[ text()='Add a New Employee']");
	private By nextButton = By.xpath("//span[ text()='Next']");
//	private By previousButton = By.xpath("//span[ text()='Previous']");
	private By saveButton = By.xpath("//span[ text()='Save']") ;
//	private By cancelButton = By.xpath("//span[ text()='Cancel']") ;
	
	// personal details  modal Locators
	private By employeeIdTextfield = By.id("employee_id");
	private By firstnameTextfield = By.id("first_name");
	private By lastnametextfield = By.id("last_name");
	private By nationalityTextfield = By.id("rc_select_1");
	private By dateOfBirthTextfield = By.id("birthday") ;
	private By gendertextfield = By.id("rc_select_2");
	private By marriageStatusTextfield = By.id("rc_select_3");
	
	//Work modal Locators
	private By employeeStatusTextfield = By.id("rc_select_6");
	private By departmentTextfield = By.id("rc_select_7");
	private By jobTitleTextfield = By.id("rc_select_8");
	private By joinedTextfield = By.id("joined_date");
	private By timeZoneTextfield = By.id("rc_select_10");
	
	//contact modal locators
	private By countryTextfield = By.id("rc_select_11") ;
	
	//Error modal
	private By errorModal = By.id("messageModelBody") ;
	private By okButton = By.xpath("//button[ text()='Ok']");
	
	
// Employee page Actions
	public void clickOnAddNewEmployeeButton() {
		driver.findElement(addNewEmployeeButton).click();
	}
	
	public void enterEmployeePersonalDetails(String employeeId,
			String fisrtname, String lastname, String nationality, 
			String dob, String gender, String marriageStatus) {
		driver.findElement(employeeIdTextfield).sendKeys(employeeId);
		driver.findElement(firstnameTextfield).sendKeys(fisrtname);
		driver.findElement(lastnametextfield).sendKeys(lastname);
		driver.findElement(nationalityTextfield).sendKeys(nationality, Keys.ENTER);
		driver.findElement(dateOfBirthTextfield).sendKeys(dob, Keys.ENTER);
		driver.findElement(gendertextfield).sendKeys(gender, Keys.ENTER);
		driver.findElement(marriageStatusTextfield).sendKeys(marriageStatus, Keys.ENTER);
		driver.findElement(nextButton).click();
	}
	
	public void enterIdentificationDetails() {
		driver.findElement(nextButton).click();
	}
	
	public void eneterEmployeeWorkDetails(String employmetType, String depertament,
			String jobTitle, String joineddate, String timeZone) {
		driver.findElement(employeeStatusTextfield).sendKeys(employmetType, Keys.ENTER);
		driver.findElement(departmentTextfield).sendKeys(depertament, Keys.ENTER);
		driver.findElement(jobTitleTextfield).sendKeys(jobTitle, Keys.ENTER);
		driver.findElement(joinedTextfield).sendKeys(joineddate, Keys.ENTER);
		driver.findElement(timeZoneTextfield).sendKeys(timeZone, Keys.ENTER);
		driver.findElement(nextButton).click();
	}
	
	public void enterContactDetails(String country) {
		driver.findElement(countryTextfield).sendKeys(country, Keys.ENTER);
		driver.findElement(nextButton).click();
	}
	
	public void enterReportDetails() {
		
	}
	
	public void clickOnSaveButton() {
		driver.findElement(saveButton).click();
	}

	public void VerifySuccessMessage() {
		
	}
	
	public void VerifyErrorMessage() {
		String error = driver.findElement(errorModal).getText();
		if( error.contains("Duplicate entry"))
		{
			System.out.println("Test case pass");
			driver.findElement(okButton).click();
		}
		else
		{
			System.out.println("Test case fail");
		}
	}

}












