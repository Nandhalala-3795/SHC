package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.PORTALLoginpage_OR;
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
		DriverActions.entertext(txt_Username, username, PORTALLoginpage_OR.username_ele_name);
		
		DriverActions.entertext(txt_Password, password, PORTALLoginpage_OR.password_ele_name);
		
		DriverActions.click(btn_Login, PORTALLoginpage_OR.login_ele_name);
		
		WaitFactory.waitforloading();
	}
	
}
