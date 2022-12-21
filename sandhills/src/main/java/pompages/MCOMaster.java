package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverUtilities.DriverActions;
import objectRepository.MCOMaster_OR;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOMaster {


	//User Maintenance
	
	@FindBy(xpath = MCOMaster_OR.link_UserMaintenance)
	private WebElement UserMaintenance;
	
	@FindBy(xpath = MCOMaster_OR.System_Users)
	private WebElement SystemUsers;
	
	@FindBy(xpath = MCOMaster_OR.User_Roles)
	private WebElement UserRoles;
	
	@FindBy(xpath = MCOMaster_OR.Functional_Groups)
	private WebElement FunctionalGroups;
	
	@FindBy(xpath = MCOMaster_OR.Departments)
	private WebElement Departments;
	
	@FindBy(xpath = MCOMaster_OR.Portal_Users)
	private WebElement PortalUsers;
	
	
	//Master Maintenance
	
	@FindBy(xpath = MCOMaster_OR.link_MasterMaintenance)
	private WebElement MasterMaintenance;
	
	@FindBy(xpath = MCOMaster_OR.Guidelines)
	private WebElement Guidelines;
	
	@FindBy(xpath = MCOMaster_OR.Dropdown)
	private WebElement Dropdowns;
	
	@FindBy(xpath = MCOMaster_OR.Announcement_Maintenance)
	private WebElement anc_mnt;
	
	@FindBy(xpath = MCOMaster_OR.Measure_Maintenance)
	private WebElement MSR_mnt;
	
	@FindBy(xpath = MCOMaster_OR.Credential_Checklist)
	private WebElement Cred_chk_lst ;
	
	@FindBy(xpath = MCOMaster_OR.Custom_Field_Management)
	private WebElement cust_fld_mgnt;
	
	@FindBy(xpath = MCOMaster_OR.Task_List_Maintenance)
	private WebElement tsk_lst_mgnt ;
	
	
	//Service Maintenance
	
	@FindBy(xpath = MCOMaster_OR.Service_Maintenance)
	private WebElement ServiceMaintenance;
	
	@FindBy(xpath = MCOMaster_OR.Service_Matrix)
	private WebElement srvc_mat;
	
	@FindBy(xpath = MCOMaster_OR.Benefit_Plan)
	private WebElement bp;
	
	@FindBy(xpath = MCOMaster_OR.Definition)
	private WebElement defn;
	
	@FindBy(xpath = MCOMaster_OR.License_Group)
	private WebElement lic_grp;
	
	@FindBy(xpath = MCOMaster_OR.Age_Group)
	private WebElement age_grp;
	
	@FindBy(xpath = MCOMaster_OR.POS)
	private WebElement pos;
	
	@FindBy(xpath = MCOMaster_OR.Diagnosis_Group_to_Service)
	private WebElement diag_grp_srvc;
	
	@FindBy(xpath = MCOMaster_OR.Diagnosis_Group_to_Diag)
	private WebElement diag_grp_diag;
	
	@FindBy(xpath = MCOMaster_OR.IBHS)
	private WebElement ibhs;
	
	
	@FindBy(xpath = MCOMaster_OR.User_Audit)
	private WebElement usr_adt;
	
	@FindBy(xpath = MCOMaster_OR.GEF_Exclusion)
	private WebElement gef_excln;
	
	
	//common
	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement home;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	private WebDriver driver;
	
	public MCOMaster(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage return_home() {
		DriverActions.click(home, common_OR.home_elementname);
		return new MCOHomepage(driver);
	}
	
	private void click_UserMaintenance() {
		DriverActions.click(UserMaintenance, MCOMaster_OR.Usr_mnt_ele_name);
	}
	
	public MCOSystemUsers click_SystemUsers() {
		if(!SystemUsers.isDisplayed())
		click_UserMaintenance();
		
		DriverActions.click(SystemUsers, MCOMaster_OR.Usr_mnt_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOSystemUsers(driver);
	}
	
	public MCOUserRoles click_UserRoles() {
		if(!SystemUsers.isDisplayed())
		click_UserMaintenance();
		
		DriverActions.click(UserRoles, MCOMaster_OR.Usr_rls_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOUserRoles(driver);
	}
	
	public MCOFunctionalGroup click_FunctionalGroup() {
		if(!SystemUsers.isDisplayed())
		click_UserMaintenance();
		
		DriverActions.click(FunctionalGroups, MCOMaster_OR.Fn_grp_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOFunctionalGroup(driver);
	}
	
	public MCODepartments click_Departments() {
		if(!SystemUsers.isDisplayed())
		click_UserMaintenance();
		
		DriverActions.click(Departments, MCOMaster_OR.Dept_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCODepartments(driver);
	}
	
	public MCOPortalUsers click_PortalUsers() {
		if(!SystemUsers.isDisplayed())
		click_UserMaintenance();
		
		DriverActions.click(PortalUsers, MCOMaster_OR.prtl_usr_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOPortalUsers(driver);
	}
	
	private void click_MasterMaintenance() {
		DriverActions.click(MasterMaintenance, MCOMaster_OR.mstr_maint_ele_name);
	}
	
	public MCOGuidelines click_Guidelines () {
		if(!Guidelines.isDisplayed())
			click_MasterMaintenance();
		
		DriverActions.click(Guidelines, MCOMaster_OR.guidelines_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOGuidelines(driver);
		
	}
	
	public MCODropdown click_Dropdowns() {
		if(!Guidelines.isDisplayed())
			click_MasterMaintenance();
		
		DriverActions.click(Dropdowns, MCOMaster_OR.dd_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCODropdown(driver);
		
	}
	
	public MCOAnnouncementMaintenance click_Announcement_maintenace () {
		if(!Guidelines.isDisplayed())
			click_MasterMaintenance();
		
		DriverActions.click(anc_mnt, MCOMaster_OR.ancmaint_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOAnnouncementMaintenance(driver);
		
	}
	
	public MCOMeasureMaintenance click_MeasureMaintenance () {
		if(!MSR_mnt.isDisplayed())
			click_MasterMaintenance();
		
		DriverActions.click(MSR_mnt, MCOMaster_OR.msrmaint_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOMeasureMaintenance(driver);
		
	}
	
	public MCOCredentialChecklist click_CredentialCheckList () {
		if(!MSR_mnt.isDisplayed())
			click_MasterMaintenance();
		
		DriverActions.click(Cred_chk_lst, MCOMaster_OR.msrmaint_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOCredentialChecklist(driver);
		
	}
	
	public MCOCustomFieldManagement click_CustomFieldManagement () {
		if(!MSR_mnt.isDisplayed())
			click_MasterMaintenance();
		
		DriverActions.click(cust_fld_mgnt, MCOMaster_OR.cst_fld_mgnt_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOCustomFieldManagement(driver);
		
	}
	
	public MCOTaskListManagement click_TaskListManagement () {
		if(!MSR_mnt.isDisplayed())
			click_MasterMaintenance();
		
		DriverActions.click(tsk_lst_mgnt, MCOMaster_OR.tsl_lst_mgnt_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOTaskListManagement(driver);
		
	}
	
	private void click_ServiceMaintenance() {
		DriverActions.click(ServiceMaintenance, MCOMaster_OR.srvc_mnt_ele_name);
	}
	
	public MCOServiceMatrix click_ServiceMatrix () {
		if(!srvc_mat.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(srvc_mat, MCOMaster_OR.srvc_mat_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOServiceMatrix(driver);
		
	}
	
	public MCOBenefitPlan click_BenefitPlan () {
		if(!bp.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(bp, MCOMaster_OR.bp_pln_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOBenefitPlan(driver);
		
	}
	
	public MCODefinition click_Definition () {
		if(!defn.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(defn, MCOMaster_OR.def_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCODefinition(driver);
		
	}
	
	public MCOLicenseGroup click_LicenseGroup () {
		if(!lic_grp.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(lic_grp, MCOMaster_OR.lic_grp_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOLicenseGroup(driver);
		
	}
	
	public MCOAgeGroup click_AgeGroup () {
		if(!age_grp.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(age_grp, MCOMaster_OR.age_grp_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOAgeGroup(driver);
		
	}
	
	public MCOPOS click_POS () {
		if(!pos.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(pos, MCOMaster_OR.pos_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOPOS(driver);
		
	}
	
	public MCODiagnosisGroupTOService click_Diagnosis_Group_To_Service () {
		if(!diag_grp_srvc.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(diag_grp_srvc, MCOMaster_OR.dia_grp_srvc_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCODiagnosisGroupTOService(driver);
		
	}
	
	public MCODiagnosisGroupToDiag click_Diagnosis_Group_To_Diag () {
		if(!diag_grp_diag.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(diag_grp_diag, MCOMaster_OR.diag_grp_diag_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCODiagnosisGroupToDiag(driver);
		
	}
	
	public MCOIBHS click_IBHS () {
		if(!ibhs.isDisplayed())
			click_ServiceMaintenance();
		
		DriverActions.click(ibhs, MCOMaster_OR.ibhs_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOIBHS(driver);
		
	}
	
	public MCOUserAudit click_USER_Audit () {
			
		DriverActions.click(usr_adt, MCOMaster_OR.usr_adt_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOUserAudit(driver);
		
	}
	
	public MCOGEFExclusion click_GEF_Exclusion () {
		
		DriverActions.click(gef_excln, MCOMaster_OR.gef_ele_name);
		
		if(Loading.isDisplayed())
			WaitFactory.waitforloading();
		
		return new MCOGEFExclusion(driver);
		
	}
	
	
	
}
