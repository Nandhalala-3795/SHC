package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverUtilities.DriverActions;
import objectRepository.MCOClinical_OR;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOClinical {

	@FindBy(xpath = MCOClinical_OR.Utilization_Management)
	private WebElement Utilization_management;
	
	@FindBy(xpath = MCOClinical_OR.SAR)
	private WebElement SAR;
	
	@FindBy(xpath = MCOClinical_OR.Treatment_Plan)
	private WebElement Treatment_Plan;
	
	@FindBy(xpath = MCOClinical_OR.Authorization)
	private WebElement Authorization;
	
	@FindBy(xpath = MCOClinical_OR.Routing_Rules)
	private WebElement Routing_Rules;
	
	@FindBy(xpath = MCOClinical_OR.Call_center)
	private WebElement Call_center;
	
	@FindBy(xpath = MCOClinical_OR.Calls)
	private WebElement Calls;
	
	@FindBy(xpath = MCOClinical_OR.Referral_Search)
	private WebElement Referral_Search;
	
	@FindBy(xpath = MCOClinical_OR.reg_unmet_needs)
	private WebElement reg_unmet_needs;
	
	@FindBy(xpath = MCOClinical_OR.Backup_staffing)
	private WebElement Backup_staffing;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	private WebDriver driver;
	
	public MCOClinical(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	private void click_Utilization_Management() {
		DriverActions.Click(Utilization_management, MCOClinical_OR.UM_ele_name);
	}
	
	public MCOSARPage Click_SAR() {
		if(!SAR.isDisplayed())
			click_Utilization_Management();
		
		DriverActions.Click(SAR, MCOClinical_OR.sar_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOSARPage(driver);
	}
	
	public MCOTreatmentPlanPage Click_TXPlan() {
		if(!SAR.isDisplayed())
			click_Utilization_Management();
		
		DriverActions.Click(Treatment_Plan, MCOClinical_OR.TX_PN_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOTreatmentPlanPage(driver);
	}
	
	public MCOAuthorizationPage Click_Authorization() {
		if(!Authorization.isDisplayed())
			click_Utilization_Management();
		
		DriverActions.Click(Authorization, MCOClinical_OR.auth_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOAuthorizationPage(driver);
	}
	
	public MCORoutingRulesPage Click_Routing_Rules() {
		if(!Routing_Rules.isDisplayed())
			click_Utilization_Management();
		
		DriverActions.Click(Routing_Rules, MCOClinical_OR.RoutRles_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCORoutingRulesPage(driver);
	}
	
	private void click_Call_Center() {
		DriverActions.Click(Call_center, MCOClinical_OR.call_cntr_ele_name);
	}
	
	public MCOCallsPage Click_Calls() {
		if(!Calls.isDisplayed())
			click_Call_Center();
		
		DriverActions.Click(Calls, MCOClinical_OR.calls_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOCallsPage(driver);
	}
	
	public MCOReferralsearchPage Click_Referral_Search() {
		if(!Referral_Search.isDisplayed())
			click_Utilization_Management();
		
		DriverActions.Click(Referral_Search, MCOClinical_OR.ref_search_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOReferralsearchPage(driver);
	}
	
	public MCORegUnmetNeedsInnovationsPage Click_RegUnmetNeedsInnovations() {

		DriverActions.Click(reg_unmet_needs, MCOClinical_OR.unmet_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCORegUnmetNeedsInnovationsPage(driver);
	}
	
	public MCOBackupStaffingPage Click_BackupStaffing() {

		DriverActions.Click(Backup_staffing, MCOClinical_OR.bckstf_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOBackupStaffingPage(driver);
	}
	
}
