package driverutilities;

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
	 * @throws Exception 
	 */
	public static boolean initDriver() throws Exception {
		
		boolean flag;
		if(Objects.isNull(DriverManager.getDriver())) {
			try {
				DriverManager.setDriver(DriverFactory.getDriver());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(Objects.nonNull(DriverManager.getDriver()))
			flag = true;
		else
			flag = false;
		
		return flag;
		
	}
	
	/**
	 * This method is used to close the browser
	 */
	public static boolean quitDriver() {
		
		boolean flag;
		
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
		if(Objects.isNull(DriverManager.getDriver()))
			flag = true;
		else 
			flag = false;
		
		return flag;
	}
	
}
