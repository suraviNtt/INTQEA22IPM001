package our_project_name.handlers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author User
 *
 */
public class CommonMethods {

	WebDriverWait wait;

	/**
	 * 
	 * @param element
	 * @param driver
	 */
	public void clickOnWebElement(WebElement element, WebDriver driver) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(12));
			if (wait.until(ExpectedConditions.elementToBeClickable(element)) != null) {
				element.click();
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clicked");
		}
	}

}
