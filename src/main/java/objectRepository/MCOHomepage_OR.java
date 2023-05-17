package objectRepository;

public interface MCOHomepage_OR {
	
	String link_patientModule = "//span[text()='Patient']/preceding-sibling::i/parent::a";
	String patmod_ele_name = "Patient Module";

	String link_ProviderNetwork = "//span[text()='Provider Network']//preceding-sibling::i//parent::a";
	String providernetwork_ele_name = "Provider Network";
	
	String link_Finance = "//span[text()='Finance']/preceding-sibling::i/parent::a";
	String finance_ele_name = "Finance";
	
	String link_Clinical = "//span[text()='Clinical']/preceding-sibling::i/parent::a";
	String Clinical_ele_name = "Clinical";
	
	String link_Care_Coordination = "//span[text()='Care Coordination']/preceding-sibling::i/parent::a";
	String CC_ele_name = "Care Coordination";
	
	String link_Grievance = "//span[text()='Grievance']/preceding-sibling::i/parent::a";
	String Grievance_ele_name = "Grievance";
	
	String link_Reports = "//span[text()='Reports']/preceding-sibling::i/parent::a";
	String Rpt_ele_name = "Reports";
	
	String link_Master = "//span[text()='Master']/preceding-sibling::i/parent::a";
	String Mstr_ele_name = "Master";
	
	String link_usr_prfl = "//span[text()='User Profile']/preceding-sibling::i/parent::a";
	String usr_prfl_ele_name = "User Profile";
	
	String link_unst = "//span[text()='University']/preceding-sibling::i/parent::a";
	String unst_ele_name = "University";
	
	String link_lms = "//span[text()='LMS']/parent::a";
	String lms_ele_name = "LMS";
	
}
