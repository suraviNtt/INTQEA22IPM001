package our_project_name.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import our_project_name.handlers.CommonMethods;

public class HomePage extends CommonMethods {
	
	WebDriver driver;

	@FindBy(name = "Practo login")
	WebElement loginOrSignupButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openLoginPage() throws InterruptedException {
		clickOnWebElement(loginOrSignupButton, driver);
		Thread.sleep(12);
		System.out.println("Login Page loaded successfully");
	}
	
	public void enterloginCreds(String username , String password) {
		System.out.println(username);
		System.out.println(password);
	}

}
