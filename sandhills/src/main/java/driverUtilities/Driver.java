package driverUtilities;

import java.util.Objects;

/**
 * 
 * @author Alphi-Nandhalala
 * This class is responsible for initialization and close browsr
 *
 */

public class Driver {

	private Driver() {}
	
	/**
	 * This method is used to initialize the browser
	 * @param BrowserName
	 */
	public static void initDriver() {
		if(Objects.isNull(DriverManager.getDriver())) {
			try {
				DriverManager.setDriver(DriverFactory.getDriver());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * This method is used to close the browser
	 */
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
	
}
