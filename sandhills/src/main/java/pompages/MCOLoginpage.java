package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.MCOLoginpage_OR;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOLoginpage {

	@FindBy(xpath = MCOLoginpage_OR.txt_Username)
	private WebElement txt_Username;
	
	@FindBy(xpath = MCOLoginpage_OR.txt_Password)
	private WebElement txt_Password;
	
	@FindBy(xpath = MCOLoginpage_OR.btn_Login)
	private WebElement btn_Login;

	@FindBy(xpath = common_OR.Loading)
	private WebElement loading;
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public MCOLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage Login(String username, String password) {
		
		DriverActions.entertext(txt_Username, username, MCOLoginpage_OR.username_ele_name);
		
		DriverActions.entertext(txt_Password, password, MCOLoginpage_OR.password_ele_name);
		
		DriverActions.click(btn_Login, MCOLoginpage_OR.login_ele_name);
		
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		return new MCOHomepage(driver);
	}
	
}

