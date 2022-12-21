package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverUtilities.DriverActions;
import objectRepository.common_OR;

public class MCOClaimMaintenancePage {

	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement home;
	
	private WebDriver driver;
	
	public MCOClaimMaintenancePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public MCOHomepage return_homne() {
		DriverActions.click(home, common_OR.home_elementname);
		return new MCOHomepage(driver);
	}
	
}
