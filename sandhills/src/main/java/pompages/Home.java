package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.Home_OR;
import objectRepository.common_OR;
import reports.Logger;
import wait.WaitFactory;

public class Home {

	@FindBy(xpath = Home_OR.txt_Heading)
	private WebElement heading;
	
	@FindBy(xpath = Home_OR.link_mco)
	private WebElement mco_link;
	
	@FindBy(xpath = Home_OR.link_portal)
	private WebElement portal_link;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	private WebDriver driver;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		if(heading.isDisplayed()&&!Loading.isDisplayed()) {
			Logger.LogInfo("Home page is displayed");
		}
	}
	
	public MCOLoginpage ClickMCOloginlink(){
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		if(mco_link.isDisplayed()&&!Loading.isDisplayed()) {
			if(DriverActions.click(mco_link,Home_OR.mco_link_ele_name))
				Logger.LogInfo("MCO Link is clicked");
		}
		
		WaitFactory.waitforloading();
		return new MCOLoginpage(driver);
	}
	
	public PORTALLoginpage ClickPORTALloginlink() {
		if(portal_link.isDisplayed()&&!Loading.isDisplayed()) {
			DriverActions.click(portal_link,Home_OR.portal_link_ele_name);
			}
		
		
		WaitFactory.waitforloading();
		return new PORTALLoginpage(driver);
	}
	
}
