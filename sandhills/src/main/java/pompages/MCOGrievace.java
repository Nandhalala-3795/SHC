package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOGrievace {

	@FindBy(xpath = common_OR.home_elementname)
	private WebElement Home;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	private WebDriver driver;
	
	public MCOGrievace(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage return_home() {
		DriverActions.click(Home, common_OR.home_elementname);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOHomepage(driver);
	}
	
	
}
