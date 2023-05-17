package objectRepository;

public interface MCOUserRoles_OR {

	String addusr_btn = "//span[contains(text(),'Add User')]/parent::button";
	
	String user_role_dd = "//mat-label[contains(text(),'User Name')]"
			+ "/parent::label/parent::span/preceding-sibling::mat-select";
	
	String user = "//mat-option/span[contains(text(),'userid')]";
	
	String addusr_save_btn = "//span[contains(text(),'Save')]/parent::button";
	
}
