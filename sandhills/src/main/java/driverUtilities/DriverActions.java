package driverUtilities;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

public class DriverActions {

	public static void Click(WebElement Element) {
		while(true) {
			try {
					Element.click();
					break;
			}
			catch(ElementClickInterceptedException e) {
				continue;
			}
		}
	}
	
	public static void entertext(WebElement ele, String text_to_be_entered) {
		ele.sendKeys(text_to_be_entered);
	}
	
}
