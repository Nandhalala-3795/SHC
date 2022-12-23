package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.MCOHomepage_OR;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOHomepage {
	
	@FindBy(xpath = MCOHomepage_OR.link_patientModule)
	private WebElement link_patientModule;

	@FindBy(xpath = MCOHomepage_OR.link_ProviderNetwork)
	private WebElement link_providerNetwork;
	
	@FindBy(xpath = MCOHomepage_OR.link_Finance)
	private WebElement link_Finance;
	
	@FindBy(xpath = MCOHomepage_OR.link_Clinical)
	private WebElement link_Clinical;
	
	@FindBy(xpath = MCOHomepage_OR.link_Care_Coordination)
	private WebElement link_CareCoordination;
	
	@FindBy(xpath = MCOHomepage_OR.link_Grievance)
	private WebElement link_Grievance;
	
	@FindBy(xpath = MCOHomepage_OR.link_Reports)
	private WebElement link_Reports;
	
	@FindBy(xpath = MCOHomepage_OR.link_Master)
	private WebElement link_Master;
	
	@FindBy(xpath = MCOHomepage_OR.link_usr_prfl)
	private WebElement link_usr_prfl;
	
	@FindBy(xpath = MCOHomepage_OR.link_unst)
	private WebElement link_unst;
	
	@FindBy(xpath = MCOHomepage_OR.link_lms)
	private WebElement link_lms;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement loading;
	
	private WebDriver driver;
	
	public MCOHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public MCOPatientModule navigate_patientmodule() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_patientModule, MCOHomepage_OR.patmod_ele_name);
		return new MCOPatientModule(driver);
	}
	
	public MCOProviderNetwork navigate_providernetwork() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_providerNetwork, MCOHomepage_OR.providernetwork_ele_name);
		return new MCOProviderNetwork(driver);
	}
	
	public MCOFinance navigate_Finance() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_Finance, MCOHomepage_OR.finance_ele_name);
		return new MCOFinance(driver);
	}
	
	public MCOClinical navigate_Clinical() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_Clinical, MCOHomepage_OR.Clinical_ele_name);
		return new MCOClinical(driver);
	}
	
	public MCOCareCoordination navigate_CareCoordination() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_CareCoordination, MCOHomepage_OR.CC_ele_name);
		return new MCOCareCoordination(driver);
	}
	
	public MCOGrievace navigate_Grievance() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_Grievance, MCOHomepage_OR.Grievance_ele_name);
		return new MCOGrievace(driver);
	}
	
	public MCOReports navigate_Reports() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_Reports, MCOHomepage_OR.Rpt_ele_name);
		return new MCOReports(driver);
	}
	
	public MCOMaster navigate_Master() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_Master, MCOHomepage_OR.Mstr_ele_name);
		return new MCOMaster(driver);
	}
	
	public MCOUserProfile navigate_User_Profile() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_usr_prfl, MCOHomepage_OR.usr_prfl_ele_name);
		return new MCOUserProfile(driver);
	}
	
	public MCOUniversity navigate_University() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_unst, MCOHomepage_OR.unst_ele_name);
		return new MCOUniversity(driver);
	}
	
	public MCOLMS navigate_LMS() {
		
		if(loading.isDisplayed())
			WaitFactory.waitforloading();
		
		DriverActions.click(link_lms, MCOHomepage_OR.unst_ele_name);
		return new MCOLMS(driver);
	}
	
}
