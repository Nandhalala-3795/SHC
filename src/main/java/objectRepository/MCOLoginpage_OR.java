package objectRepository;

public interface MCOLoginpage_OR {

	String txt_Username = "//input[@ng-reflect-name='UserName']" ;
	String username_ele_name = "Username text feild";
	
	String txt_Password = "//input[@ng-reflect-name='Password']" ; 
	String password_ele_name = "Password text field";
	
	String btn_Login = "//button" ;
	String login_ele_name = "Login button";

	String old_pass = "//input[@id='mat-input-4']";
	String old_pass_ele_name = "Old password text box";
	
	String new_pass = "//input[@id='mat-input-2']";
	String new_pass_ele_name = "New password text box";
	
	String confirm_pass = "//input[@id='mat-input-3']";
	String conirm_pass_ele_name = "Confirm Password text box";
	
	String rst_pass_heading = "//span[contains(text(),'Reset Password')]";
	String rst_pass_hdng_ele_name = "Reset passowrd";
	
}
