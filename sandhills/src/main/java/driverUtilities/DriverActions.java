package driverUtilities;

import java.util.Objects;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import reports.Logger;

public class DriverActions {

	public static boolean click(WebElement element, String elementname) {
		
		boolean flag;
		
		while(true) {
			try {
				if(isElementPresent(element,elementname)) {
					element.click();
					flag = true;
					break;
				}
				else {
					Logger.LogFail("Element '" + elementname + " is not present");
					flag = false;
				}
			}
			catch(ElementClickInterceptedException e) {
				continue;
			}
			catch(NoSuchElementException e) {
				e.printStackTrace();
				Logger.LogFail("Element not found");
			}
		}
		return flag;
		
	}
	
	public static void entertext(WebElement ele, String text_to_be_entered, String elementName) {
		
		ele.sendKeys(text_to_be_entered);
		
		Logger.LogInfo("The given text : "+text_to_be_entered+" is entered in the "+elementName);
	
	}
	
	public static String getTEXT(WebElement ele, String elementName) {
		if(Objects.nonNull(ele.getText())) {
			Logger.LogInfo("Text is received from element : " + elementName);
			return ele.getText();
		}
		else {
			return new Exception("No text in the element '"+ elementName+"'").toString();
		}
		
	}
	
	private static boolean isElementPresent (WebElement ele, String elementname) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		} finally {
			if (flag) {
				Logger.LogInfo(elementname + " : Element is present");

			} else {
				Logger.LogInfo("Unable to locate element" + elementname);
			}
		}
		return flag;
	}
	
	
}
