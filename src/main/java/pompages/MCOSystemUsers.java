package pompages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import driverutilities.DriverFactory;
import driverutilities.DriverManager;
import fileReaders.SYSUSRdatareader;
import objectRepository.MCOSystemUsers_OR;
import objectRepository.common_OR;
import reports.Logger;
import wait.WaitFactory;

public class MCOSystemUsers {

	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement home;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	@FindBy(xpath = MCOSystemUsers_OR.create_btn)
	private WebElement btn_Create;
	
	@FindBy(xpath = MCOSystemUsers_OR.lastname_input)
	private WebElement ip_lastname;
	
	@FindBy(xpath = MCOSystemUsers_OR.firstname_input)
	private WebElement ip_firstname;
	
	@FindBy(xpath = MCOSystemUsers_OR.login_input)
	private WebElement ip_login;
	
	@FindBy(xpath = MCOSystemUsers_OR.middle_initial_input)
	private WebElement ip_middle_initial;
	
	@FindBy(xpath = MCOSystemUsers_OR.password_input)
	private WebElement ip_password;
	
	@FindBy(xpath = MCOSystemUsers_OR.department_input)
	private WebElement ip_dept;
	
	@FindBy(xpath = MCOSystemUsers_OR.manager_input)
	private WebElement ip_manager;
	
	@FindBy(xpath = MCOSystemUsers_OR.title_input)
	private WebElement ip_title;
	
	@FindBy(xpath = MCOSystemUsers_OR.email_input)
	private WebElement ip_email;
	
	@FindBy(xpath = MCOSystemUsers_OR.phone1_input)
	private WebElement ip_ph1;
	
	@FindBy(xpath = MCOSystemUsers_OR.phone2_input)
	private WebElement ip_ph2;
	
	@FindBy(xpath = MCOSystemUsers_OR.filter_btn)
	private WebElement btn_filter;
	
	@FindBy(xpath=common_OR.logout)
	private WebElement btn_logout;
	
	@FindBy(xpath = MCOSystemUsers_OR.alredyexsistserr)
	private WebElement userexsistserr;
	
	private WebDriver driver;
	
	public MCOSystemUsers(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage return_home() {
		DriverActions.click(home, common_OR.home_elementname);
		return new MCOHomepage(driver);
	}
	
	private void click_create() {
		DriverActions.click(btn_Create, MCOSystemUsers_OR.create_btn_ele_name);
	}
	
	public String createNewUser()  {
		
		click_create();
		
		WaitFactory.waitforloading();
		
		Map<String, String> userdata = SYSUSRdatareader.getuserdata();
		
		DriverActions.entertext(ip_lastname, userdata.get("LastName"), MCOSystemUsers_OR.lastname_ele_name);
		
		DriverActions.entertext(ip_firstname, userdata.get("FirstName"), MCOSystemUsers_OR.firstname_ele_name);
		
		DriverActions.entertext(ip_login, userdata.get("Login"), MCOSystemUsers_OR.login_ele_name);
		
		DriverActions.entertext(ip_password, userdata.get("Password"), MCOSystemUsers_OR.password_ele_name);
		
		DriverActions.entertext(ip_dept, userdata.get("Department"), MCOSystemUsers_OR.dept_ele_name);
		
		WaitFactory.waitforloading();
		
		String[] Manager = userdata.get("Manager").split(",");
		
		DriverActions.entertext(ip_manager, Manager[0], MCOSystemUsers_OR.manager_ele_name);
		
		WaitFactory.waitforloading();
		
		String manager = MCOSystemUsers_OR.dropdown;
		
		String managerdd = manager.replaceAll("XX", userdata.get("Manager"));
		
		DriverActions.click(managerdd, MCOSystemUsers_OR.manager_ele_name);
		
		WaitFactory.waitforloading();
		
		DriverActions.click(MCOSystemUsers_OR.save_btn, MCOSystemUsers_OR.savebtn_ele_name);
		
		WaitFactory.waitforloading();
		
////		if(userexsistserr.isDisplayed()) {
////			try {
////				throw new Exception("User already exsists");
////			}catch(Exception e) {
////				
////			}
////			
//			
//		}
		
		String userid_xpath = common_OR.table_body_data.replaceAll("columnindex","[1]");
		
		userid_xpath = userid_xpath.replaceAll("rowindex","[1]");
		
		String userid = DriverActions.getTEXT(driver.findElement
				(By.xpath(userid_xpath)), userid_xpath);
		
		//System.out.println(userid);
		
		return userid;
		
	}
	
	public void ClickFilter(){
		
		DriverActions.click(btn_filter, MCOSystemUsers_OR.ftrbtn_ele_name);
		if(DriverActions.isElementPresent(MCOSystemUsers_OR.filter_heading, 
				MCOSystemUsers_OR.filter_heading_ele_name)) {
			Logger.LogInfo("Filter is opened");
		}
		
	}
	
	public void loginfilterdata(String Login) {
		
		WaitFactory.waitforloading();
		
		DriverActions.entertext(MCOSystemUsers_OR.filter_login, 
				Login, MCOSystemUsers_OR.filter_login_ele_name);
		
	}
	
	public void firstnamefilterdata(String FirstName) {
		
		WaitFactory.waitforloading();
		
		DriverActions.entertext(MCOSystemUsers_OR.filter_firstname, 
				FirstName, MCOSystemUsers_OR.filter_firstname_ele_name);
		
	}

	public void lastnamefilterdata(String LastName) {
	
		WaitFactory.waitforloading();
		
		DriverActions.entertext(MCOSystemUsers_OR.filter_lastname, 
				LastName, MCOSystemUsers_OR.filter_lastname_ele_name);
		
	}

	
	  public void useridfilterdata(String userid) {
	  
		  WaitFactory.waitforloading();
	  
	  DriverActions.entertext(MCOSystemUsers_OR.filter_useridname,
	  userid,  MCOSystemUsers_OR.filter_useridname);
	  
	  }
	 
	
	public void filtersearch() {
		
		WaitFactory.waitforloading();
		
		DriverActions.click(MCOSystemUsers_OR.filter_search, MCOSystemUsers_OR.ftr_sch_ele_name);
		
		WaitFactory.waitforloading();
		
	}
	
	public void expanddatadetails(String columnName, String data) {
		
		WebDriver driver = DriverManager.getDriver();
		
		List<WebElement> columns = driver.findElements(By.xpath(common_OR.table_header_data));
		
		Integer columnnumber = 0;
		
		List<String> columnnames = new ArrayList<String>();
		
		for (WebElement webElement : columns) {
			columnnames.add(DriverActions.getTEXT(webElement, (columnnumber++).toString()));
		}
		
		Integer columnindex = columnnames.indexOf(columnName)+1;
		
		System.out.println(columnindex);
		
		
		  List<WebElement> bodyrows =
		  driver.findElements(By.xpath(common_OR.table_body_rows));
		  
		  Integer size = bodyrows.size()/2;
		  
		  System.out.println(bodyrows.size());
		  
		  System.out.println(size);
		  
		  String xpath = common_OR.table_body_data.replaceAll("columnindex","["+
		  columnindex.toString()+"]");
			
		  for(int i = 1 ; i<=size ; i++) 
		  { 
			  Integer temp = i*2-1;
			  String tempxpath = xpath.replaceAll("rowindex","["+ temp.toString()+"]");
			  WebElement el =
					  driver.findElement(By.xpath(tempxpath));
			  String eltext = DriverActions.getTEXT(el, temp.toString());
			  System.out.println(eltext+"  "+data);
			  if(eltext.equalsIgnoreCase(data)) {
				  DriverActions.click(el, tempxpath);
				  break;
			  }
		}
		  WaitFactory.waitforloading();
		  
		  WaitFactory.waitforELEMENTVISIBILITY
		  (driver.findElement(By.xpath("(//button/span[contains(text(),'Details')])[1]")));
		  assertEquals(driver.findElement(By.xpath("(//button/span[contains(text(),'Details')])[1]")).isDisplayed(), 
				  true,"Detail button is visible");
		  if(driver.findElement(By.xpath("(//button/span[contains(text(),'Details')])[1]")).isDisplayed()) {
			  System.out.println("click on details button");
			  //DriverActions.click("//button/span[contains(text(),'Details')]", "Details button");
			  assertEquals(DriverActions.click("(//button/span[contains(text(),'Details')])[1]", 
					  "Details button"), 
					  true,"Details button is clicked");
			  WaitFactory.waitforloading();
		  }
		  
		  
		 
	}
	
	public void checkADMINperm() {
		
		WebDriver driver = DriverManager.getDriver();
		
		WebElement ele = driver.findElement(By.xpath("//tbody/tr[1]/td[9]/mat-checkbox/label/span"));
		
		DriverActions.click(ele, "Admin permission");
		 	
		driver.findElement(By.xpath("//button/span[contains(text(),'Save')]")).click();
		
		try { 
			Thread.sleep(10000); 
			}
		catch (InterruptedException e) {
			e.printStackTrace(); 
			}
		}
	
	public MCOLoginpage clickLOGOUT() {
		
		WaitFactory.waitforloading();
		
		DriverActions.click(btn_logout, "Logout button");
		
		return new MCOLoginpage(driver);
		
	}
		
//	public MCOHomepage loginnewuser(MCOLoginpage mcologin) {
//		
//		Map<String, String> userdata = SYSUSRdatareader.getuserdata();
//		
//		mcologin.Login(userdata.get("Login"), userdata.get("Password"));
//		
//		return new MCOHomepage(driver);
//		
//	}
	
	}
	

