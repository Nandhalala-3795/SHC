package driverutilities;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import reports.Logger;

public class DriverActions {

	/**
	 * Click method to click an webelement
	 * @param element
	 * @param elementname
	 * @return
	 */
	
	public static boolean click(WebElement element, String elementname) {
		
		boolean flag = false;
		
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
				Logger.LogFail(elementname +" : Element not found");
				throw new NoSuchElementException(elementname + " : Element not found");
			}
		}
		return flag;
		
	}
	
	public static boolean click(String elementxpath, String elementname) {
		
		boolean flag = false;
		
		while(true) {
			try {
				WebElement element = DriverManager.getDriver().findElement(By.xpath(elementxpath));
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
				Logger.LogFail(elementname +" : Element not found");
				break;
			}
		}
		return flag;
		
	}
	
	public static void entertext(WebElement ele, String text_to_be_entered, String elementName) {
		
		ele.sendKeys(text_to_be_entered);
		
		Logger.LogInfo("The given text : "+text_to_be_entered+" is entered in the "+elementName);
	
	}
	
	public static void entertext(String elementxpath, String text_to_be_entered, String elementName) {
		
		WebElement ele = DriverManager.getDriver().findElement(By.xpath(elementxpath));
		
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
			if(Objects.nonNull(ele)&&ele.isDisplayed())
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				Logger.LogInfo(elementname + " : Element is present");

			} else {
				Logger.LogInfo("Unable to locate element" + elementname);
			}
		}
		return flag;
	}
	
	public static boolean isElementPresent (String elementxpath, String elementname) {
		boolean flag = false;
		WebElement ele = DriverManager.getDriver().findElement(By.xpath(elementxpath));
		try {
			if(Objects.nonNull(ele)&&ele.isDisplayed())
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
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
