package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverutilities.DriverActions;
import objectRepository.MCOFunctionalGroup_OR;
import objectRepository.common_OR;
import reports.Logger;
import wait.WaitFactory;

public class MCOFunctionalGroup {

	@FindBy(xpath = common_OR.link_MCOHOME)
	private WebElement home;
	
	@FindBy(xpath = common_OR.Loading)
	private WebElement Loading;
	
	@FindBy(xpath = MCOFunctionalGroup_OR.functional_group_dd)
	private WebElement dd_func_grp;
	
	@FindBy(xpath = MCOFunctionalGroup_OR.add_user_btn)
	private WebElement btn_addusr;
	
	@FindBy(xpath = MCOFunctionalGroup_OR.user_dd)
	private WebElement dd_usr;
	
	@FindBy(xpath = MCOFunctionalGroup_OR.save_btn)
	private WebElement btn_save;
	
	private WebDriver driver;
	
	public MCOFunctionalGroup(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public MCOHomepage return_home() {
		DriverActions.click(home, common_OR.home_elementname);
		return new MCOHomepage(driver);
	}
	
	public void selectFunctionlGroup(String Role, String Username) {
		
		WaitFactory.waitforELEMENTVISIBILITY(dd_func_grp);
		
		DriverActions.click(dd_func_grp, MCOFunctionalGroup_OR.func_grp_ele_name);
		
		String role = MCOFunctionalGroup_OR.function_group_option.replaceAll("Role", Role);
		
		WebElement role_ele = driver.findElement(By.xpath(role));
		
		DriverActions.click(role_ele, Role);
		
		WaitFactory.waitforloading();
		
		DriverActions.click(btn_addusr, MCOFunctionalGroup_OR.addusr_ele_name);
		
		WaitFactory.waitforELEMENTVISIBILITY(dd_usr);
		
		DriverActions.click(dd_usr, "User Dropdown");
		
		String userxpath = MCOFunctionalGroup_OR.user.replaceAll("user", Username);
		
		if(driver.findElement(By.xpath(userxpath)).isDisplayed()) {
			
			DriverActions.click(userxpath, Username);
		
		}
		
		else {
			Logger.LogInfo(Username +" User already exsists in the functional group : "+Role);
		}
		
		DriverActions.click(btn_save, "Save button");
		
		WaitFactory.waitforloading();
		
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
}
