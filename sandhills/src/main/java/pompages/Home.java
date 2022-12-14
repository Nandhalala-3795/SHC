package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverUtilities.DriverActions;
import objectRepository.Home_OR;
import wait.WaitFactory;

public class Home {

	@FindBy(xpath = Home_OR.txt_Heading)
	private WebElement heading;
	@SuppressWarnings("unused")
	private String heading_ele_name = "Heading";
	
	@FindBy(xpath = Home_OR.MCO_Link)
	private WebElement MCOLINK;
	private String mcolink_ele_name = "MCO LINK";
	
	@FindBy(xpath = Home_OR.PORTAL_Link)
	private WebElement PORTALLINK;
	private String portallink_ele_name = "Portal LINK";
	
	private WebDriver driver;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOLoginpage ClickMCOloginlink(){
		DriverActions.Click(MCOLINK,mcolink_ele_name);
		WaitFactory.waitforloading();
		return new MCOLoginpage(driver);
	}
	
	public PORTALLoginpage ClickPORTALloginlink() {
		DriverActions.Click(PORTALLINK,portallink_ele_name);
		WaitFactory.waitforloading();
		return new PORTALLoginpage(driver);
	}
	
}
