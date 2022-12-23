package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.MCOCareCoordination_OR;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOCareCoordination {

	@FindBy(xpath = MCOCareCoordination_OR.MyCaseLoad)
	private WebElement MyCaseLoad ;
	
	@FindBy(xpath = MCOCareCoordination_OR.CaseLoadMgnt)
	private WebElement CaseLoadMgnt;
	
	@FindBy(xpath = MCOCareCoordination_OR.SlotScheduler)
	private WebElement SlotScheduler;
	
	@FindBy(xpath = MCOCareCoordination_OR.SIS)
	private WebElement SIS;
	
	@FindBy(xpath = MCOCareCoordination_OR.Referrals_and_Discharges)
	private WebElement Referrals_and_Discharges;
	
	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement home;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	private WebDriver driver;
	
	public MCOCareCoordination(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage return_home() {
		DriverActions.click(home, common_OR.home_elementname);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOHomepage(driver);
	}
	
	public MCOMyCaseLoadPage click_MyCaseLoad() {
		DriverActions.click(MyCaseLoad, MCOCareCoordination_OR.mycsld_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOMyCaseLoadPage(driver);
	}
	
	public MCOCaseLoadmanagementPage click_CaseLoadManagement() {
		DriverActions.click(CaseLoadMgnt, MCOCareCoordination_OR.csldmgnt_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOCaseLoadmanagementPage(driver);
	}
	
	public MCOSlotSchedulerPage click_SlotScheduler() {
		DriverActions.click(SlotScheduler, MCOCareCoordination_OR.sltsch_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOSlotSchedulerPage(driver);
	}
	
	public MCOSISPage click_SIS() {
		DriverActions.click(SIS, MCOCareCoordination_OR.SIS_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOSISPage(driver);
	}
	
	public MCOReferralsandDischargePage click_Referrals_and_Discharge() {
		DriverActions.click(Referrals_and_Discharges, MCOCareCoordination_OR.refndis_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOReferralsandDischargePage(driver);
	}
	
}
