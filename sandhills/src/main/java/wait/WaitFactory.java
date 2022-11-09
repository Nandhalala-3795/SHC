package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverUtilities.DriverManager;

/**
 * Wait class
 * @author Alphi-Nandhalala
 *
 */
public class WaitFactory {

	private WaitFactory() {}
	
	private static WebDriverWait wait;
	
	/**
	 * Wait till loading is finished
	 * @param driver
	 * @param timeout
	 */
	public static void waitforload(int timeoutinseconds) {
		
		wait = new WebDriverWait(DriverManager.getDriver(), 
				Duration.ofSeconds(timeoutinseconds));
		
		wait.until(ExpectedConditions
				.invisibilityOfElementWithText
				(By.xpath("//div[text()='Loading']"), "Loading"));;
		
	}
	
}
