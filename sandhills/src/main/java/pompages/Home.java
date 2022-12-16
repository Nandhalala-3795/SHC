package pompages;

import static org.testng.Assert.assertEquals;

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
	
	@FindBy(xpath = Home_OR.MCO_Link)
	private WebElement MCOLINK;
	
	@FindBy(xpath = Home_OR.PORTAL_Link)
	private WebElement PORTALLINK;
	
	private WebDriver driver;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOLoginpage ClickMCOloginlink(){
		DriverActions.Click(MCOLINK,Home_OR.mcolink_ele_name);
		
		WaitFactory.waitforloading();
		return new MCOLoginpage(driver);
	}
	
	public PORTALLoginpage ClickPORTALloginlink() {
		DriverActions.Click(PORTALLINK,Home_OR.portallink_ele_name);
		WaitFactory.waitforloading();
		return new PORTALLoginpage(driver);
	}
	
}
