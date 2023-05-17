package objectRepository;

public interface MCOMaster_OR {

	
	// User maintenance
	
	String link_UserMaintenance = "//a[contains(text(),'User Maintenance')]";
	String Usr_mnt_ele_name = "User Maintenance";
	
	String System_Users = "//a[contains(text(),'System Users')]";
	String sys_usr_ele_name = "System Users";
	
	String User_Roles = "//a[contains(text(),'User Roles')]";
	String Usr_rls_ele_name = "User Roles";
	
	String Functional_Groups = "//a[contains(text(),'Function Groups')]";
	String Fn_grp_ele_name = "Functional Group";
	
	String Departments = "//a[contains(text(),'Departments')]";
	String Dept_ele_name = "Departments";
	
	String Portal_Users = "//a[contains(text(),'Portal Users')]";
	String prtl_usr_ele_name = "Portal Users";
	
	
	//Master Maintenance
	
	String link_MasterMaintenance = "//a[contains(text(),' Master Maintenance ')]";
	String mstr_maint_ele_name = "Master Maintenance";
	
	String Guidelines = "//a[contains(text(),'Guidelines')]";
	String guidelines_ele_name = "GuideLines";
	
	String Dropdown = "//a[contains(text(),'Dropdowns')]";
	String dd_ele_name = "Dropdowns";
	
	String Announcement_Maintenance = "//a[contains(text(),'Announcement Maintenance')]";
	String ancmaint_ele_name = "Announcement Maintenance";
	
	String Measure_Maintenance  = "//a[contains(text(),'Measure Maintenance')]";
	String msrmaint_ele_name = "Measure Maintenance";
	
	String Credential_Checklist = "//a[contains(text(),'Credential Checklist')]";
	String credchklst_ele_name = "Credential Checklist";
	
	String Custom_Field_Management = "//a[contains(text(),'Custom Field Management')]";
	String cst_fld_mgnt_ele_name = "Custom Field Management";
	
	String Task_List_Maintenance = "//a[contains(text(),'Task List Maintenance')]";
	String tsl_lst_mgnt_ele_name = "Task List Maintenance";
	
	//Service Maintenance
	
	String Service_Maintenance = "//a[contains(text(),' Service Maintenance ')]";
	String srvc_mnt_ele_name = "Service Maintenance";
	
	String Service_Matrix = "(//a[contains(text(),'Service Matrix')])[2]";
	String srvc_mat_ele_name = "Service Matrix";
	
	String Benefit_Plan = "(//a[contains(text(),'Benefit Plan')])[2]";
	String bp_pln_ele_name = "Benefit Plan";
	
	String Definition = "//a[contains(text(),'Definition')]";
	String def_ele_name = "Definition";
	
	String License_Group = "//a[contains(text(),'License Groups')]";
	String lic_grp_ele_name = "License Group";
	
	String Age_Group = "//a[contains(text(),'Age Groups')]";
	String age_grp_ele_name = "Age Group";
	
	String POS = "//a[contains(text(),'POS')]";
	String pos_ele_name = "POS";
	
	String Diagnosis_Group_to_Service = "//a[contains(text(),'Diagnosis Group to Service')]";
	String dia_grp_srvc_ele_name = "Diagnosis Group to Service";
	
	String Diagnosis_Group_to_Diag = "//a[contains(text(),'Diagnosis Group to Diag')]";
	String diag_grp_diag_ele_name = "Diagnosis Group to Diag";
	
	String IBHS = "//a[contains(text(),'I-BHS')]";
	String ibhs_ele_name = "I-BHS";
	
	
	String User_Audit = "//a[contains(text(),'User Audit')]";
	String usr_adt_ele_name = "User Audit";
	
	String GEF_Exclusion = "//a[contains(text(),'GEF Exclusion')]";
	String gef_ele_name = "GEF Eclusion";
	
}
