package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import constants.ConfigurationValues;
import driverUtilities.Driver;
import driverUtilities.DriverManager;
import fileReaders.ConfigurationReader;

@Listeners(listeners.Listeners.class)

public class BaseClass {

	private WebDriver driver;
	
	private String username = ConfigurationReader.get(ConfigurationValues.username);
	
	private String password = ConfigurationReader.get(ConfigurationValues.password);
	
	@BeforeMethod
	public void setup() {
		Driver.initDriver();
		driver = DriverManager.getDriver();
		driver.get(ConfigurationReader.get(ConfigurationValues.URL));
		
	}
	
	@AfterMethod
	public void teardown() {
		Driver.quitDriver();
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public String get_Username() {
		return username;
	}
	
	public String get_Password() {
		return password;
	}
	
}
