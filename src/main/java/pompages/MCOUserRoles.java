package pompages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.MCOUserRoles_OR;
import objectRepository.common_OR;
import wait.WaitFactory;

public class MCOUserRoles {

	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement home;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	@FindBy(xpath = common_OR.table_items_per_page)
	private WebElement ipp;
	
	private WebDriver driver;
	
	public MCOUserRoles(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage return_home() {
		DriverActions.click(home, common_OR.home_elementname);
		return new MCOHomepage(driver);
	}
	
	public void searchUserrole(String UserRole, String userid) {
		
		DriverActions.click(ipp, "Items per Page");
		
		String xpath = common_OR.item_per_page_index;
		
		xpath = xpath.replaceAll("INDEX", "500");
		
		DriverActions.click(xpath, xpath);
		
		List<WebElement> columns = driver.findElements(By.xpath(common_OR.table_header_data));
		
		Integer columnnumber = 0;
		System.out.println(columns);
		List<String> columnnames = new ArrayList<String>();
		
		for (WebElement webElement : columns) {
			columnnames.add(DriverActions.getTEXT(webElement, (columnnumber++).toString()));
		}
		
		Integer columnindex = columnnames.indexOf("ROLE NAME")+1;
		
		System.out.println(columnindex);
		
		List<WebElement> bodyrows =
				  driver.findElements(By.xpath(common_OR.table_body_rows));
				  
		Integer size = bodyrows.size()/2;
				  
		System.out.println(bodyrows.size());
				  
		System.out.println(size);
				  
		String rolexpath = common_OR.table_body_data.replaceAll("columnindex","["+
				  columnindex.toString()+"]/b");
		
		Integer userroled_dets = 0;
		
		 for(int i = 1 ; i<=size ; i++) 
		  { 
			  Integer temp = i*2-1;
			  String tempxpath = rolexpath.replaceAll("rowindex","["+ temp.toString()+"]");
			  WebElement el =
					  driver.findElement(By.xpath(tempxpath));
			  String eltext = DriverActions.getTEXT(el, temp.toString());
			  System.out.println(eltext+"  "+UserRole);
			  if(eltext.equalsIgnoreCase(UserRole)) {
				  
				  WaitFactory.waitforELEMENTVISIBILITY(el);
				  
				 Actions action = new Actions(driver);
				 action.scrollToElement(el);
				 DriverActions.click(el, tempxpath);
				 userroled_dets = temp+1;
				  break;
			  }
		}
		 
		 String details_xpath = rolexpath.replaceAll("rowindex","["+ userroled_dets.toString()+"]");
		 
		 details_xpath=details_xpath.
				 replaceAll("/b", "/div/div/div[2]/div/button");
		 
		 DriverActions.click(details_xpath, details_xpath);
		 
		 WaitFactory.waitforloading();
		 
		 DriverActions.click(MCOUserRoles_OR.addusr_btn, "Add user button");
		 
		 DriverActions.click(MCOUserRoles_OR.user_role_dd, "User Role drodown");
		 
		 String useroption = MCOUserRoles_OR.user.replaceAll("userid", userid);
		 
		 DriverActions.click(useroption, userid);
		 
		 DriverActions.click(MCOUserRoles_OR.addusr_save_btn, "Save button");
		 
		 WaitFactory.waitforloading();
		
	}
	
}
