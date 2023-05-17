package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import constants.ConfigurationValues;
import driverutilities.Driver;
import driverutilities.DriverManager;
import fileReaders.ConfigurationReader;
import reports.Logger;
import security.decrypt;

@Listeners(listeners.Listeners.class)

public class BaseClass {

	private WebDriver driver;
	
	private String MCOusername = ConfigurationReader.get(ConfigurationValues.mcousername);
	
	private String MCOpassword = ConfigurationReader.get(ConfigurationValues.mcopassword);
	
	private String encrytedMCOusername = decrypt.DECRYPT(
			ConfigurationReader.get(ConfigurationValues.encryptedmcousername));
	
	private String encryptedMCOpassword = decrypt.DECRYPT(
			ConfigurationReader.get(ConfigurationValues.encryptedmcopassword));
	
	@BeforeMethod
	public void setup() throws Exception {
		Driver.initDriver();
		driver = DriverManager.getDriver();
		driver.get(ConfigurationReader.get(ConfigurationValues.URL));
		
	}
	
	@AfterMethod
	public void teardown() {
		if(Driver.quitDriver())
			Logger.LogInfo("Driver is closed");
		else
			Logger.LogFail("Driver is not closed");
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public String get_MCOUsername() {
		return MCOusername;
	}
	
	public String get_MCOPassword() {
		return MCOpassword;
	}
	
	public String get_encryptedMCOUsername() {
		return encrytedMCOusername;
	}
	
	public String get_encryptedMCOPassword() {
		return encryptedMCOpassword;
	}
	
}
