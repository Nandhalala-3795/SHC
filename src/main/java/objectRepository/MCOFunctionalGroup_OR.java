package objectRepository;

public interface MCOFunctionalGroup_OR {

	String functional_group_dd = "//mat-select[@name = 'user']";
	String func_grp_ele_name = "Functional Group dropdown";
	
	String function_group_option = "//mat-option/span[contains(text(),'Role')]";
	
	String add_user_btn = "//span[contains(text(),'Add User')]";
	String addusr_ele_name = "Add User Button";
	
	String user_dd = "//mat-label[contains(text(),'User')]"
			+ "/parent::label/parent::span/preceding-sibling::mat-select";
	
	String user = "//mat-option/span[contains(text(),'user')]";
	
	String save_btn = "//span[contains(text(),'Save')]/parent::button";
	
	
}
