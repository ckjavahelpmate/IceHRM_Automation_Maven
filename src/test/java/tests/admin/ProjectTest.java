//package tests.admin;
//
//import java.lang.reflect.Method;
//import java.util.HashMap;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import pages.adminpages.ProjectPage;
//import pages.genericpages.HomePage;
//import pages.genericpages.LoginPage;
//import utility.BaseTest;
//import utility.DataUtility;
//
//public class ProjectTest extends BaseTest {
//
//	@DataProvider
//	public Object[] getTestdata(Method method) {
//		Object[] alldata = DataUtility.getAlldata("AdminTestdata.xlsx", method.getName());
//		return alldata;
//	}
//
//	@Test(priority = 1, dataProvider = "getTestdata")
//	public void projectAddTest(HashMap<String, String> data) throws InterruptedException {
//
//		// 3. Login to application
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApplication(DataUtility.getEnvironmentProperty("USERNAME"),
//				DataUtility.getEnvironmentProperty("PASSWORD"));
//
//		// 4. click on project link
//		HomePage homePage = new HomePage(driver);
//		homePage.clickOnProjectLink();
//
//		// 5. Click add project button
//		ProjectPage projectPage = new ProjectPage(driver);
//		projectPage.clickOnAddNewButton();
//		Thread.sleep(3000);
//
//		// 6. Enter project detail and click on add
//		projectPage.addProject(data.get("ProjectName"), data.get("ProjectStatus"));
//
//	}
//
//	@Test(priority = 3, dataProvider = "getTestdata")
//	public void projectEditTest(HashMap<String, String> data) throws InterruptedException {
//
//		// 3. Login to application
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApplication(DataUtility.getEnvironmentProperty("USERNAME"),
//				DataUtility.getEnvironmentProperty("PASSWORD"));
//
//		// 4. click on project link
//		HomePage homePage = new HomePage(driver);
//		homePage.clickOnProjectLink();
//		Thread.sleep(2000);
//
//		// 5. Edit the Project
//		ProjectPage projectPage = new ProjectPage(driver);
//		projectPage.clickOnEditButton(data.get("ProjectName"));
//		Thread.sleep(3000);
//
//		// 6. Change the project status
//		projectPage.enterProjectStatus(data.get("ProjectStatus"));
//
//		// 7. click on save button
//		projectPage.clickOnSaveButton();
//
//	}
//
//	@Test(priority = 2, dataProvider = "getTestdata")
//	public void projectViewTest(HashMap<String, String> data) throws InterruptedException {
//
//		// 3. Login to application
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApplication(DataUtility.getEnvironmentProperty("USERNAME"),
//				DataUtility.getEnvironmentProperty("PASSWORD"));
//
//		// 4. click on project link
//		HomePage homePage = new HomePage(driver);
//		homePage.clickOnProjectLink();
//
//		// 5. click on view project
//		ProjectPage projectPage = new ProjectPage(driver);
//		projectPage.clickOnViewButton(data.get("ProjectName"));
//		Thread.sleep(3000);
//
//	}
//
//	@Test(priority = 4, dataProvider = "getTestdata")
//	public void projectDeleteTest(HashMap<String, String> data) throws InterruptedException {
//
//		// 3. Login to application
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApplication(DataUtility.getEnvironmentProperty("USERNAME"),
//				DataUtility.getEnvironmentProperty("PASSWORD"));
//
//		// 4. click on project link
//		HomePage homePage = new HomePage(driver);
//		homePage.clickOnProjectLink();
//		Thread.sleep(2000);
//
//		// 5. Delete the project
//		ProjectPage projectPage = new ProjectPage(driver);
//		projectPage.clickOnDeleteButton(data.get("ProjectName"));
//
//	}
//
//}
