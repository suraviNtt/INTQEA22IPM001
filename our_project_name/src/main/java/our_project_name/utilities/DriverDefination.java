package our_project_name.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Select mutiple brower driver functions
 * @author Class Creator Name
 *
 */
public class DriverDefination {

	WebDriver driver;
	/**
	 * 
	 */
	private void setChrome() {
		WebDriverManager.chromedriver().setup();
	}
	
	/**
	 *  firefox browser setup
	 *  @author User
	 */
	private void setFirefox() {
		WebDriverManager.firefoxdriver().setup();
	}
	
	/**
	 * 
	 */
	private void setSafari() {
		WebDriverManager.safaridriver().setup();
	}
	
	/**
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver setBrowser(String browser) {
		switch (browser) {
		case "chrome":
			setChrome();
			driver = new ChromeDriver();
			break;
		case "firefox":
			setFirefox();
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			setSafari();
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}
		driver.manage().window().maximize();
		return driver;
	}

	public void closeWindow(WebDriver driver) {
		driver.close();
	}
	
	public void teardown(WebDriver driver) {
		driver.quit();
	}
}
