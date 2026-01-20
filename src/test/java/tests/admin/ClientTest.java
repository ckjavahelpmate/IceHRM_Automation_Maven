//package tests.admin;
//
//import java.lang.reflect.Method;
//import java.util.HashMap;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import pages.adminpages.ClientPage;
//import pages.genericpages.HomePage;
//import pages.genericpages.LoginPage;
//import utility.BaseTest;
//import utility.DataUtility;
//
//public class ClientTest extends BaseTest {
//	@DataProvider
//	public Object[] getTestdata(Method method) {
//		Object[] alldata = DataUtility.getAlldata("AdminTestdata.xlsx", method.getName());
//		return alldata;
//	}
//
//	@Test(priority = 1, dataProvider = "getTestdata")
//	public void clientAddTest(HashMap<String, String> data) throws InterruptedException {
//
//		// 3. Login to application
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApplication(DataUtility.getEnvironmentProperty("USERNAME"),
//				DataUtility.getEnvironmentProperty("PASSWORD"));
//
//		// 4. Click on client link
//		HomePage homePage = new HomePage(driver);
//		homePage.clickOnClientLink();
//
//		// 5. click on Add new
//		ClientPage clientPage = new ClientPage(driver);
//		clientPage.clickOnAddNewButton();
//
//		// 6. Enter client details
//		clientPage.enterClientDetails(data.get("ClientName"), data.get("ClientStatus"));
//
//	}
//
//	@Test(priority = 2, dataProvider = "getTestdata")
//	public void clientDeletetest(HashMap<String, String> data) throws InterruptedException {
//
//		// 3. Login to application
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApplication(DataUtility.getEnvironmentProperty("USERNAME"),
//				DataUtility.getEnvironmentProperty("PASSWORD"));
//
//		// 4. Click on client link
//		HomePage homePage = new HomePage(driver);
//		homePage.clickOnClientLink();
//
//		// 5. Delete Client
//		ClientPage clientPage = new ClientPage(driver);
//		clientPage.clickOnDeleteButton(data.get("ClientName"));
//		clientPage.clickOnConfirmDeleteButton();
//
//	}
//
//	@Test(priority = 3, dataProvider = "getTestdata")
//	public void clientViewtest(HashMap<String, String> data) throws InterruptedException {
//
//		// 3. Login to application
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApplication("admin", "admin");
//	}
//}
