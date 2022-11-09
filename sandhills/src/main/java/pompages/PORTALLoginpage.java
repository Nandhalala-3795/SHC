package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import driverUtilities.DriverActions;
import objectRepository.PORTALLoginpage_OR;
import reports.Logger;
import wait.WaitFactory;

public class PORTALLoginpage {

	@FindBy(xpath = PORTALLoginpage_OR.txt_Username)
	private WebElement txt_Username;
	
	@FindBy(xpath = PORTALLoginpage_OR.txt_Password)
	private WebElement txt_Password;
	
	@FindBy(xpath = PORTALLoginpage_OR.btn_Login)
	private WebElement btn_Login;
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public PORTALLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void Login(String username, String password) {
		txt_Username.sendKeys(username);
		Reporter.log(username + " is entered in username field",true);
		Logger.LogInfo(username + " is entered in username field");
		txt_Password.sendKeys(password);
		Reporter.log(password + " is entered in password field",true);
		Logger.LogInfo(password + " is entered in password field");
		
		WaitFactory.waitforload(30);
		
		DriverActions.Click(btn_Login);
		Reporter.log("Login button is clicked",true);
		Logger.LogInfo("Login button is clicked");
	}
	
}
