package driverUtilities;

import java.util.Objects;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import reports.Logger;

public class DriverActions {

	public static void Click(WebElement Element, String ElementName) {
		
		while(true) {
			try {
				if(Element_Present(Element)) {
					Element.click();
					Logger.LogPass("Element '" + ElementName + "' is clicked");
					break;
				}
				else {
					Logger.LogFail("Element '" + ElementName + " is not present");
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
		
	}
	
	public static void entertext(WebElement ele, String text_to_be_entered, String ElementName) {
		
		ele.sendKeys(text_to_be_entered);
		
		Logger.LogPass("The given text : "+text_to_be_entered+" is entered in the "+ElementName);
	
	}
	
	public static String getTEXT(WebElement ele, String ElementName) {
		if(Objects.nonNull(ele.getText())) {
			Logger.LogInfo("Text is received from element : " + ElementName);
			return ele.getText();
		}
		else {
			return new Exception("No text in the element '"+ ElementName+"'").toString();
		}
		
	}
	
	private static boolean Element_Present (WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Element is present");

			} else {
				System.out.println("Unable to locate element");
			}
		}
		return flag;
	}
	
	
}
