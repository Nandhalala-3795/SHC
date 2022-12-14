package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverUtilities.DriverActions;
import objectRepository.MCOFinance_OR;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOFinance {

	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement home;
	
	@FindBy(xpath = MCOFinance_OR.link_Claims)
	private WebElement link_claims;
	
	@FindBy(xpath = MCOFinance_OR.Claim_maintenance)
	private WebElement claim_maintenance;
	
	@FindBy(xpath = MCOFinance_OR.Claim_Exception)
	private WebElement claim_exception;
	
	@FindBy(xpath = MCOFinance_OR.GL_Account_Management)
	private WebElement GL_Account_Management;
	
	@FindBy(xpath = MCOFinance_OR.CMS1500)
	private WebElement CMS1500;
	
	@FindBy(xpath = MCOFinance_OR.UB04)
	private WebElement UB04;
	
	@FindBy(xpath = MCOFinance_OR.Claim_Batches)
	private WebElement Claim_Batches;
	
	@FindBy(xpath = MCOFinance_OR._835Processing)
	private WebElement _835Processing;
	
	@FindBy(xpath = MCOFinance_OR.Generate835)
	private WebElement Generate_835;
	
	@FindBy(xpath = MCOFinance_OR.Batch_Readjudication)
	private WebElement Batch_Readjudication;
	
	@FindBy(xpath = MCOFinance_OR._837)
	private WebElement _837;
	
	@FindBy(xpath = MCOFinance_OR.Rate_Schedule)
	private WebElement Rate_Schedule;
	
	@FindBy(xpath = MCOFinance_OR.Proc_code_Compatibility)
	private WebElement Proc_code_compatibility;
	
	@FindBy(xpath = MCOFinance_OR.COB)
	private WebElement COB;
	
	@FindBy(xpath = MCOFinance_OR.Funding_Capitation)
	private WebElement Funding_Capitation;
	
	@FindBy(xpath = MCOFinance_OR.Check_Write_Schedule)
	private WebElement Check_Write_Schedule;
	
	@FindBy(xpath = MCOFinance_OR.Check_Select_Process)
	private WebElement Check_Select_Process;
	
	@FindBy(xpath = MCOFinance_OR.ED_Service_Matrix)
	private WebElement ED_Service_Matrix;
	
	@FindBy(xpath = MCOFinance_OR.RA_Reports)
	private WebElement RA_Reports;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	private WebDriver driver;
	
	public MCOFinance(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage return_home() {
		DriverActions.Click(home, common_OR.home_elementname);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOHomepage(driver);
	}
	
	private void click_claims() {
		DriverActions.Click(link_claims, MCOFinance_OR.claims_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
	}
	
	public MCOClaimMaintenancePage click_ClaimMaintenance() {
		if(!claim_maintenance.isDisplayed())
		click_claims();
		
		DriverActions.Click(claim_maintenance, MCOFinance_OR.claimmaint_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOClaimMaintenancePage(driver);
	}
	
	public MCOClaimExceptionPage click_ClaimException() {
		if(!claim_exception.isDisplayed())
		click_claims();
		DriverActions.Click(claim_exception, MCOFinance_OR.claims_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOClaimExceptionPage(driver);
	}
	
	public MCOGLAccountmanagementPage click_GLAccountManagement() {
		if(!GL_Account_Management.isDisplayed())
		click_claims();
		DriverActions.Click(GL_Account_Management, MCOFinance_OR.GLaccmgnt_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOGLAccountmanagementPage(driver);
	}
	
	public MCOCMS1500Page click_CMS1500() {
		DriverActions.Click(CMS1500, MCOFinance_OR.cms_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOCMS1500Page(driver);
	}
	
	public MCOUB04Page click_UB04() {
		DriverActions.Click(UB04, MCOFinance_OR.ub04_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOUB04Page(driver);
	}
	
	private void click_clmbts() {
		DriverActions.Click(Claim_Batches, MCOFinance_OR.clmbt_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
	}
	
	public MCO835processingPage click_835Processing() {
		if(!_835Processing.isDisplayed())
		click_clmbts();
		
		DriverActions.Click(_835Processing, MCOFinance_OR._835prcs_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCO835processingPage(driver);
	}
	
	public MCOGenerate835Page click_Generate835() {
		if(!Generate_835.isDisplayed())
		click_clmbts();
		
		DriverActions.Click(Generate_835, MCOFinance_OR.gnrt835_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOGenerate835Page(driver);
	}
	
	public MCOBatchReAdjudicationPage click_BatchReadjudication() {
		if(!Batch_Readjudication.isDisplayed())
		click_clmbts();
		
		DriverActions.Click(Batch_Readjudication, MCOFinance_OR.bt_readj_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOBatchReAdjudicationPage(driver);
	}
	
	public MCO837Page click_837() {
		if(!_837.isDisplayed())
		click_clmbts();
		
		DriverActions.Click(_837, MCOFinance_OR._837_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCO837Page(driver);
	}
	
	public MCORateSchedulePage click_Rate_Schedule() {
		DriverActions.Click(Rate_Schedule, MCOFinance_OR.Rt_sch_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCORateSchedulePage(driver);
	}
	
	public MCOProccodecompatibilityPage click_Proc_code_compatibility() {
		DriverActions.Click(Proc_code_compatibility, MCOFinance_OR.proc_cd_comp_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOProccodecompatibilityPage(driver);
	}
	
	public MCOCOBPage click_COB() {
		DriverActions.Click(COB, MCOFinance_OR.COB);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOCOBPage(driver);
	}
	
	public MCOFundingCapitationPage click_Funding_Capitation() {
		DriverActions.Click(Funding_Capitation, MCOFinance_OR.fundcapt_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOFundingCapitationPage(driver);
	}
	
	public MCOCheckWriteSchedulePage click_Check_Write_Schedule() {
		DriverActions.Click(Check_Write_Schedule, MCOFinance_OR.Check_Write_Schedule);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOCheckWriteSchedulePage(driver);
	}
	
	public MCOCheckSelectProcessPage click_Check_Select_Process() {
		DriverActions.Click(Check_Select_Process, MCOFinance_OR.ck_sel_pr_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOCheckSelectProcessPage(driver);
	}
	
	public MCOEDServiceMatrixPage click_ED_Service_Matrix() {
		DriverActions.Click(ED_Service_Matrix, MCOFinance_OR.ed_src_mat_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCOEDServiceMatrixPage(driver);
	}
	
	public MCORAReportsPage click_RA_Reports() {
		DriverActions.Click(RA_Reports, MCOFinance_OR.ra_rpt_ele_name);
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		return new MCORAReportsPage(driver);
	}
	
}
