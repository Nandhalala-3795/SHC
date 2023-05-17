package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import fileReaders.SYSUSRdatareader;
import objectRepository.MCOLoginpage_OR;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOLoginpage {

	@FindBy(xpath = MCOLoginpage_OR.txt_Username)
	private WebElement ip_Username;
	
	@FindBy(xpath = MCOLoginpage_OR.txt_Password)
	private WebElement ip_Password;
	
	@FindBy(xpath = MCOLoginpage_OR.btn_Login)
	private WebElement btn_Login;
	
	@FindBy(xpath = MCOLoginpage_OR.rst_pass_heading)
	private WebElement title_reset_password;
	
	@FindBy(xpath = MCOLoginpage_OR.old_pass)
	private WebElement ip_old_password;
	
	@FindBy(xpath = MCOLoginpage_OR.new_pass)
	private WebElement ip_new_password;
	
	@FindBy(xpath = MCOLoginpage_OR.confirm_pass)
	private WebElement ip_confirm_password;

	@FindBy(xpath = common_OR.Loading)
	private WebElement loading;
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public MCOLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage newuserLOGIN(String username, String oldpassword, 
			String newpassword) {
		
		username = "shc/"+username;
		
		Login(username, oldpassword);
		try{
			if(title_reset_password.isDisplayed()) {
				DriverActions.entertext(ip_old_password, oldpassword, 
						MCOLoginpage_OR.old_pass_ele_name);
				
				DriverActions.entertext(ip_new_password, newpassword, 
						MCOLoginpage_OR.new_pass_ele_name);
				
				DriverActions.entertext(ip_confirm_password, newpassword, 
						MCOLoginpage_OR.new_pass_ele_name);
				
				if(loading.isDisplayed()) {
					
					WaitFactory.waitforloading();
					
				}
				
			}
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		return Login(username, newpassword);
	}
	
	public MCOHomepage Login(String username, String password) {
		
		DriverActions.entertext(ip_Username, username, 
				MCOLoginpage_OR.username_ele_name);
		
		DriverActions.entertext(ip_Password, password, 
				MCOLoginpage_OR.password_ele_name);
		
		DriverActions.click(btn_Login, MCOLoginpage_OR.login_ele_name);
		
		if(loading.isDisplayed()) {
			
			WaitFactory.waitforloading();
			
		}
		
		return new MCOHomepage(driver);
	}
	
}

