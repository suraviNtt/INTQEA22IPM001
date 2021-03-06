package our_project_name.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import our_project_name.pages.HomePage;
import our_project_name.utilities.DriverDefination;

public class SearchResultTest {

	WebDriver driver;
	DriverDefination driverDefination;
	HomePage homePage;
	
	@BeforeClass
	public void brforeCls() {
		System.out.println("Befor Class");
	}
	
	@BeforeMethod
	public void openLoginPage() throws InterruptedException {
		driverDefination = new DriverDefination();
		driver = driverDefination.setBrowser("chrome");
		homePage = new HomePage(driver);
	//	homePage.openLoginPage();
	}

	@Test
	public void verifyLoginSuccessWithValidCreds() {
		
		homePage.enterloginCreds("user", "pass");
		
	}

	@Test
	public void verifyLoginFailureWithInvalidUsername() throws Exception {
	
		homePage.enterloginCreds("user", "pass");
		
	}

	@Test
	public void verifyLoginFailureWithInvalidPassword() throws Exception {
	
		homePage.enterloginCreds("user", "pass");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driverDefination = new DriverDefination();
		driverDefination.closeWindow(driver);
	}

}
