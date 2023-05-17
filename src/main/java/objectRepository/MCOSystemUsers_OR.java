package objectRepository;

public interface MCOSystemUsers_OR {

	String create_btn = "//span[contains(text(),'Create')]";
	String create_btn_ele_name = "Create button";
	
	String lastname_input = "//input[@id='mat-input-3']";
	String lastname_ele_name = "Lastname";

	String firstname_input = "//*[@id='mat-input-4']";
	String firstname_ele_name = "Firstname";

	String middle_initial_input = "//*[@id='mat-input-5']";
	String middleinitial_ele_name = "Middle/Initial";
	
	String login_input = "//*[@id='mat-input-6']";
	String login_ele_name = "Login ";
	
	String password_input ="//*[@id='mat-input-7']"; 
	String password_ele_name = "Password Text field";
	
	String department_input = "//*[@id='mat-input-8']";
	String dept_ele_name = "Department Text field";
	
	String manager_input = "//*[@id='mat-input-9']";
	String manager_ele_name = "Manager Text field";
	
	String title_input = "//*[@id='mat-input-10']";
	String title_ele_name = "Title Text field";
	
	String email_input = "//*[@id='mat-input-11']";
	String email_ele_name = "Email Text field";
	
	String phone1_input = "//*[@id='\"mat-input-12']";
	String ph1_ele_name = "Phone1 Text field";
	
	String phone2_input = "//*[@id='mat-input-13']";
	String ph2_ele_name =  "Phone2 Text field";
	
	String save_btn = "//span[contains(text(),'Save')]/parent::button";
	String savebtn_ele_name = "Save button";
	
	String filter_btn = "//span[contains(text(),'Filter')]/parent::button";
	String ftrbtn_ele_name = "Filter button";
	
	String filter_firstname = "//mat-label[contains(text(),'First Name')]"
			+ "/ancestor::label/parent::span/parent::div/input";
	String filter_firstname_ele_name = "First Name ";
	
	String filter_lastname = "//mat-label[contains(text(),'Last Name')]"
			+ "/ancestor::label/parent::span/parent::div/input";
	String filter_lastname_ele_name = "Last Name";
	
	String filter_login = "//mat-label[contains(text(),'Login')]"
			+ "/ancestor::label/parent::span/parent::div/input";
	String filter_login_ele_name = "Login";
	
	String filter_useridname = "//mat-label[contains(text(),'User ID')]"
			+ "/ancestor::label/parent::span/parent::div/input";
	String filter_username_ele_name = "User ID";
	
	String filter_heading = "//span[contains(text(),'System Users Filter')]";
	String filter_heading_ele_name = "System Users Filter";
	
	String filter_search = "//span[contains(text(),'Search')]/parent::button";
	String ftr_sch_ele_name = "Filter search";
	
	String dropdown = "//span[@class='mat-option-text' and contains(text(),'XX')]";
	
	String alredyexsistserr = "//div[contains(text(),"
			+ "'Supplied login already exists. Cannot insert duplicate!')]";
	
}
