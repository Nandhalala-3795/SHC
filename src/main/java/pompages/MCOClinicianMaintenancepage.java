package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOClinicianMaintenancepage {

	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement link_home;
	
	private WebDriver driver;
	
	public MCOClinicianMaintenancepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public MCOHomepage return_home() {
		if(link_home.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOHomepage(driver);
	}
	
	
}
