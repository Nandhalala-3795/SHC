package objectRepository;

public interface MCOFinance_OR {

	String link_Claims = "//a[contains(text(),'Claims')]";
	String claims_ele_name = "Claims";
	
	String Claim_maintenance = "//a[text()='Claim Maintenance']";
	String claimmaint_ele_name = "Claim Maintenance";
	
	String Claim_Exception = "//a[text()='Claim Exception']";
	String clmexe_ele_name = "Claim Exception";
	
	String GL_Account_Management = "//a[text()='GL Account Management']";
	String GLaccmgnt_ele_name = "GL Account Management";
	
	String CMS1500 = "//a[text()='CMS 1500']";
	String cms_ele_name = "CMS 1500";
	
	String UB04 = "//a[text()='UB-04']";
	String ub04_ele_name = "UB04";
	
	String Claim_Batches = "//a[text()=' Claim Batches ']";
	String clmbt_ele_name = "Claim Batches";
	
	String _835Processing = "//a[text()='835 Processing']";
	String _835prcs_ele_name = "835 Processing";
	
	String Generate835 = "//a[text()=' Generate 835 ']";
	String gnrt835_ele_name = "Generate 835";
	
	String Batch_Readjudication = "//a[text()='Batch Re-Adjudication']";
	String bt_readj_ele_name = "Batch Readjudication";
	
	String _837 = "//a[text()=' 837']";
	String _837_ele_name = "837";
	
	String Rate_Schedule ="//a[text()='Rate Schedule']";
	String Rt_sch_ele_name = "Rate Schedule";
	
	String Proc_code_Compatibility = "//a[text()='Proc Code Compatibility']";
	String proc_cd_comp_ele_name = "Proc code compatibility";
	
	String COB = "//a[text()=' COB']";
	String cob_ele_name = "COB";
	
	String Funding_Capitation = "//a[text()=' Funding Capitation']";
	String fundcapt_ele_name = "Funding Capitation";
	
	String Check_Write_Schedule = "//a[text()=' Check Write Schedule']";
	String ck_wt_sch_ele_name = "Check Write Schedule";
	
	String Check_Select_Process = "//a[text()=' Check Select Process']";
	String ck_sel_pr_ele_name = "Check Select Process";
	
	String ED_Service_Matrix = "//a[text()='ED Service Matrix']";
	String ed_src_mat_ele_name = "ED Service Matrix";
	
	String RA_Reports = "//a[text()=' RA Reports']";
	String ra_rpt_ele_name = "RA Reports";
	
}
