package test;

import org.testng.annotations.Test;

import base.BaseClass;
import pompages.Home;
import pompages.MCOCDWerrPage;
import pompages.MCOCareCoordination;
import pompages.MCOClientUpdatePage;
import pompages.MCOClinical;
import pompages.MCOClinicianMaintenancepage;
import pompages.MCOCredentiallingpluspage;
import pompages.MCODischargePage;
import pompages.MCOEnrollmentPage;
import pompages.MCOFinance;
import pompages.MCOHomepage;
import pompages.MCOLMS;
import pompages.MCOLoginpage;
import pompages.MCOMaster;
import pompages.MCONCTracksPage;
import pompages.MCOPatientMaintenancePage;
import pompages.MCOPatientMergePage;
import pompages.MCOPatientModule;
import pompages.MCOProviderMaintenancepage;
import pompages.MCOProviderMeasurepage;
import pompages.MCOProviderNetwork;
import pompages.MCOUniversity;
import pompages.MCOUserProfile;

@SuppressWarnings("unused")
public class NavigationTests extends BaseClass {

	
	@Test(priority = 01)
	public void PatientNavigationTest() {
		Home home = new Home(getDriver());
		
		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		
		MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
		
		MCOPatientModule mcopatmodule = mcohomepg.navigate_patientmodule();
		
		MCOPatientMaintenancePage mcopatmaintpg = mcopatmodule.click_PatientMaintenance();
		
		MCOPatientMergePage mcopatmergepg = mcopatmodule.click_PatientMerge();
		
		MCOEnrollmentPage mcoenrollpg = mcopatmodule.click_Enrollment();
		
		MCOCDWerrPage mcocdwerrpg = mcopatmodule.click_cdwerror();
		
		MCONCTracksPage mconctrackspg = mcopatmodule.click_NCTracks();
		
		MCODischargePage mcodischargepg = mcopatmodule.click_Discharge();
		
		MCOClientUpdatePage mcoclientupdatepg = mcopatmodule.click_ClientUpdate();
		
	}
	
	@Test(priority = 02)
	public void ProviderNavigastionTest() {
		
		Home home = new Home(getDriver());
		
		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		
		MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
		
		MCOProviderNetwork mcoprvdrnetwrk  = mcohomepg.navigate_providernetwork();
		
		MCOProviderMaintenancepage mcoprvdrmaintpg =  mcoprvdrnetwrk.click_providermaintenance();
		
		MCOClinicianMaintenancepage mcoclinmaintpg =  mcoprvdrnetwrk.click_ClinicianMaintenance();
		
		MCOProviderMeasurepage mcoprvdrmsrpg =  mcoprvdrnetwrk.click_ProviderMeasure();
		
		MCOCredentiallingpluspage mcocredpluspg =  mcoprvdrnetwrk.click_Credentiallingplus();
		
	}
	
	@Test(priority = 03)
	public void FinanceTest() {
		
		Home home = new Home(getDriver());
		
		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		
		MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
		
		MCOFinance mcofinance = mcohomepg.navigate_Finance();
		
		mcofinance.click_ClaimMaintenance();
		
		mcofinance.click_ClaimException();
		
		mcofinance.click_GLAccountManagement();
		
		mcofinance.click_CMS1500();
		
		mcofinance.click_UB04();
		
		mcofinance.click_835Processing();
		
		mcofinance.click_Generate835();
		
		mcofinance.click_BatchReadjudication();
		
		mcofinance.click_837();
		
		mcofinance.click_Rate_Schedule();
		
		mcofinance.click_Proc_code_compatibility();
		
		mcofinance.click_COB();
		
		mcofinance.click_Funding_Capitation();
		
		mcofinance.click_Check_Write_Schedule();
		
		mcofinance.click_Check_Select_Process();
		
		mcofinance.click_ED_Service_Matrix();
		
		mcofinance.click_RA_Reports();
		
	}
	
	@Test(priority = 04)
	public void clicicalNavigationtest() {
		
		Home home = new Home(getDriver());
		
		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		
		MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
		
		MCOClinical mcoclinical = mcohomepg.navigate_Clinical();
		
		mcoclinical.Click_SAR();
		
		mcoclinical.Click_TXPlan();
		
		mcoclinical.Click_Authorization();
		
		mcoclinical.Click_Routing_Rules();
		
		mcoclinical.Click_Calls();
		
		mcoclinical.Click_Referral_Search();
		
		mcoclinical.Click_RegUnmetNeedsInnovations();
		
		mcoclinical.Click_BackupStaffing();
		
	}
	
	@Test(priority = 05)
	public void ccNavigationTest() {
		
		Home home = new Home(getDriver());
		
		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		
		MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
		
		MCOCareCoordination mcocc = mcohomepg.navigate_CareCoordination();
		
		mcocc.click_MyCaseLoad();
		
		mcocc.click_CaseLoadManagement();
		
		mcocc.click_SlotScheduler();
		
		mcocc.click_SIS();
		
		mcocc.click_Referrals_and_Discharge();
		
	}
	
	@Test(priority = 06)
	public void GrievanceNavigationTest() {
		
		Home home = new Home(getDriver());
		
		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		
		MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
		
		mcohomepg.navigate_Grievance();
		
	}
	
	@Test(priority = 07)
	public void ReportsNavigationTest() {
		
		Home home = new Home(getDriver());
		
		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		
		MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
		
		mcohomepg.navigate_Reports();
		
	}
	
	@Test(priority = 11)
	public void MasterNavigationTest() {
		
		Home home = new Home(getDriver());
		
		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		
		MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
		
		MCOMaster mstrpg = mcohomepg.navigate_Master();
		
		mstrpg.click_SystemUsers();
		
		mstrpg.click_UserRoles();
		
		mstrpg.click_FunctionalGroup();
		
		mstrpg.click_Departments();
		
		mstrpg.click_PortalUsers();
		
		mstrpg.click_Guidelines();
		
		mstrpg.click_Dropdowns();
		
		mstrpg.click_Announcement_maintenace();
		
		mstrpg.click_MeasureMaintenance();
		
		mstrpg.click_CredentialCheckList();
		
		mstrpg.click_CustomFieldManagement();
		
		mstrpg.click_TaskListManagement();
		
		mstrpg.click_ServiceMatrix();
		
		mstrpg.click_BenefitPlan();
		
		mstrpg.click_Definition();
		
		mstrpg.click_LicenseGroup();
		
		mstrpg.click_AgeGroup();
		
		mstrpg.click_POS();
		
		mstrpg.click_Diagnosis_Group_To_Service();
		
		mstrpg.click_Diagnosis_Group_To_Diag();
		
		mstrpg.click_IBHS();
		
		mstrpg.click_USER_Audit();
		
		mstrpg.click_GEF_Exclusion();
		
	}
	
	@Test(priority = 12)
	public void UserProfileNavigationTest() {
			
			Home home = new Home(getDriver());
			
			MCOLoginpage mcologinpg = home.ClickMCOloginlink();
			
			MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
			
			MCOUserProfile usrprflpg = mcohomepg.navigate_User_Profile();
			
	}
	
	@Test(priority = 13)
	public void UniversityNavigationTest() {
			
			Home home = new Home(getDriver());
			
			MCOLoginpage mcologinpg = home.ClickMCOloginlink();
			
			MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
			
			MCOUniversity univpg = mcohomepg.navigate_University();
			
	}
	
	@Test(priority = 14)
	public void LMSNavigationTest() {
			
			Home home = new Home(getDriver());
			
			MCOLoginpage mcologinpg = home.ClickMCOloginlink();
			
			MCOHomepage mcohomepg = mcologinpg.Login(get_Username(), get_Password());
			
			MCOLMS lmspg = mcohomepg.navigate_LMS();
			
	}
	
}
