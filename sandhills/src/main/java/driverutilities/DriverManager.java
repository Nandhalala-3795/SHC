package driverutilities;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Alphi-Nandhalala
 *
 */
public final class DriverManager {

	/**
	 * private constructor
	 */
	private DriverManager() {}
	
	/**
	 * For thread safety using this variable
	 */
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	/**
	 * returns the webdriver from thread safe variable
	 * @return driver
	 */
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	/**
	 * This method Set the driver value to thread safe variable
	 * @param driverref
	 */
	static void setDriver(WebDriver driverref) {
		if(Objects.nonNull(driverref)) {
			driver.set(driverref);
		}
	}
	
	/**
	 * This method removes driver from thread safe variable
	 */
	static void unload() {
		driver.remove();
	}
	
}
