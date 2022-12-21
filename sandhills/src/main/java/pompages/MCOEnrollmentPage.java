package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverUtilities.DriverActions;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOEnrollmentPage {

	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement home;
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public MCOEnrollmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public MCOHomepage return_HOME() {
		DriverActions.click(home, common_OR.home_elementname);
		
		WaitFactory.waitforloading();
		
		return new MCOHomepage(driver);
	}
	
}
