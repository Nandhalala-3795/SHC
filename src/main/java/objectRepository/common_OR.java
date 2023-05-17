package objectRepository;

public interface common_OR {

	String link_MCOHOME = "//span[text()='Home']/preceding-sibling::i";
	String home_elementname = "Home button";
	
	String Loading = "//div[text()='Loading']";
	
	String table_header_elements = "//thead/tr/th";
	
	String table_header_data = "//thead/tr/th/div/div[1]";
	
	String table_body_rows = "//tbody/tr";
	
	String table_body_data = table_body_rows+"rowindex"+"/td"+"columnindex";
	
	String table_items_per_page = "//mat-select";
	
	String item_per_page_index = "//mat-option/span[contains(text(),'INDEX')]";
	
	String logout = "//button/span[contains(text(),'Logout')]";
	
}
