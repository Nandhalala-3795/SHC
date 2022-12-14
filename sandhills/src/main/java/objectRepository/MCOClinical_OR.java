package objectRepository;

public interface MCOClinical_OR {

	String Utilization_Management = "//a[contains(text(),'Utilization Management')]";
	String UM_ele_name = "Utilization Management";
	
	String SAR = "//a[contains(text(),'SAR')]";
	String sar_ele_name = "SAR";
	
	String Treatment_Plan = "//a[contains(text(),'Treatment Plan')]";
	String TX_PN_ele_name = "Treatment Plan";
	
	String Authorization = "//a[contains(text(),'Authorization')]";
	String auth_ele_name = "Authorization";
	
	String Routing_Rules = "//a[contains(text(),'Routing Rules')]";
	String RoutRles_ele_name = "Routing Rules";
	
	String Call_center = "//a[contains(text(),'Call Center')]";
	String call_cntr_ele_name = "Call Center";
	
	String Calls ="//a[contains(text(),'Calls')]";
	String calls_ele_name = "Calls";
	
	String Referral_Search = "//a[contains(text(),'Referral Search')]";
	String ref_search_ele_name = "//a[contains(text(),'Referral Search')]";
	
	String reg_unmet_needs ="//a[contains(text(),'Reg. Unmet Needs/Innovations')]";
	String unmet_ele_name = "'Reg. Unmet Needs/Innovations";
	
	String Backup_staffing = "//a[contains(text(),'Backup Staffing')]";
	String bckstf_ele_name = "Backup Staffing";
	
}
