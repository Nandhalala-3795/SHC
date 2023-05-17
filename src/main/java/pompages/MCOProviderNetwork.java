package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.MCOProviderNetwork_OR;
import wait.WaitFactory;

public class MCOProviderNetwork {

	@FindBy(xpath = MCOProviderNetwork_OR.link_ProviderMaint)
	private WebElement link_provider_maintenance;
	
	@FindBy(xpath = MCOProviderNetwork_OR.link_Clinician_Maintenance)
	private WebElement link_clinician_maintenance;
	
	@FindBy(xpath = MCOProviderNetwork_OR.link_providermeasures)
	private WebElement link_provider_measures;
	
	@FindBy(xpath = MCOProviderNetwork_OR.link_Credentialingplus)
	private WebElement link_credplus;
	
	private WebDriver driver;
	
	public MCOProviderNetwork(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public MCOProviderMaintenancepage click_providermaintenance() {
		DriverActions.click(link_provider_maintenance, MCOProviderNetwork_OR.Providermaint_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCOProviderMaintenancepage(driver);
	}
	
	public MCOClinicianMaintenancepage click_ClinicianMaintenance() {
		DriverActions.click(link_clinician_maintenance, MCOProviderNetwork_OR.clinmaint_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCOClinicianMaintenancepage(driver);
	}
	
	public MCOProviderMeasurepage click_ProviderMeasure() {
		DriverActions.click(link_provider_measures, MCOProviderNetwork_OR.providermeasures_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCOProviderMeasurepage(driver);
	}
	
	public MCOCredentiallingpluspage click_Credentiallingplus() {
		DriverActions.click(link_credplus, MCOProviderNetwork_OR.credplus_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCOCredentiallingpluspage(driver);
	}
	
}
