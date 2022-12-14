package pompages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverUtilities.DriverActions;
import objectRepository.MCOPatientModule_OR;
import objectRepository.common_OR;
import reports.Logger;
import wait.WaitFactory;

public class MCOPatientModule {

	@FindBy(xpath = MCOPatientModule_OR.link_PatienMaintenance)
	private WebElement link_patmaint;
	
	@FindBy(xpath = MCOPatientModule_OR.link_PatientMerge)
	private WebElement link_patmerge;
	
	@FindBy(xpath = MCOPatientModule_OR.link_Enrollments)
	private WebElement link_enrollment;
	
	@FindBy(xpath = MCOPatientModule_OR.link_CDWError)
	private WebElement link_cdwerr;
	
	@FindBy(xpath = MCOPatientModule_OR.link_NCtracks)
	private WebElement link_NCtracks;
	
	@FindBy(xpath = MCOPatientModule_OR.link_Discharge)
	private WebElement link_Discharge;
	
	@FindBy(xpath = MCOPatientModule_OR.link_ClientUpdate)
	private WebElement link_ClientUpdate;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement loading;
	@SuppressWarnings("unused")
	private String loading_ele_name = "Loading Screen";
	
	private WebDriver driver;
	
	public MCOPatientModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOPatientMaintenancePage click_PatientMaintenance() {
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		DriverActions.Click(link_patmaint,MCOPatientModule_OR.patmaint_ele_name);
		
		Logger.LogPass("Clicked on Patient Maintenance");
		
		WaitFactory.waitforloading();
		
		assertEquals(false, false);
		
		return new MCOPatientMaintenancePage(driver);
	}
	
	public MCOPatientMergePage click_PatientMerge() {
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		DriverActions.Click(link_patmerge,MCOPatientModule_OR.patmer_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCOPatientMergePage(driver);
	}
	
	public MCOEnrollmentPage click_Enrollment() {
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		DriverActions.Click(link_enrollment,MCOPatientModule_OR.enroll_ele_name);
		
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		return new MCOEnrollmentPage(driver);
	}
	
	public MCOCDWerrPage click_cdwerror() {
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		DriverActions.Click(link_cdwerr,MCOPatientModule_OR.cdwerr_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCOCDWerrPage(driver);
	}
	
	public MCONCTracksPage click_NCTracks() {
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		DriverActions.Click(link_cdwerr,MCOPatientModule_OR.NCTracks_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCONCTracksPage(driver);
	}
	
	public MCODischargePage click_Discharge() {
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		DriverActions.Click(link_Discharge, MCOPatientModule_OR.discharge_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCODischargePage(driver);
	}
	
	public MCOClientUpdatePage click_ClientUpdate() {
		if(loading.isDisplayed())
		WaitFactory.waitforloading();
		
		DriverActions.Click(link_ClientUpdate, MCOPatientModule_OR.clintupdt_ele_name);
		
		WaitFactory.waitforloading();
		
		return new MCOClientUpdatePage(driver);
	}
	
	
	
}
