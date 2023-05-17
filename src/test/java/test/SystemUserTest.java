package test;

import java.util.Map;

import org.testng.annotations.Test;

import base.BaseClass;
import fileReaders.SYSUSRdatareader;
import pompages.Home;
import pompages.MCOFunctionalGroup;
import pompages.MCOHomepage;
import pompages.MCOLoginpage;
import pompages.MCOMaster;
import pompages.MCOSystemUsers;
import pompages.MCOUserRoles;

public class SystemUserTest extends BaseClass {

	private String user_id;
	
	@Test
	public void Createsysusr() {

		  Home home = new Home(getDriver());
		  
		  MCOLoginpage mcologinpg = home.ClickMCOloginlink();
		  
		  MCOHomepage mcohomepg = mcologinpg.Login(get_encryptedMCOUsername(),
		  get_encryptedMCOPassword());
		  
		  MCOMaster mstrpg = mcohomepg.navigate_Master();
		  
		  MCOSystemUsers mcosysusr = mstrpg.click_SystemUsers();
		  
		 user_id =  mcosysusr.createNewUser();
		  
//		  try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}

//	}
//	
////	@Test
////	public void Filteruser() {
////		
////		Home home = new Home(getDriver());
////		  
////		  MCOLoginpage mcologinpg = home.ClickMCOloginlink();
////		  
////		  MCOHomepage mcohomepg = mcologinpg.Login(get_encryptedMCOUsername(),
////		  get_encryptedMCOPassword());
////		  
////		  MCOMaster mstrpg = mcohomepg.navigate_Master();
////		  
////		  MCOSystemUsers mcosysusr = mstrpg.click_SystemUsers();
		  
		  mcosysusr.ClickFilter();
		  
		  mcosysusr.useridfilterdata(user_id);
		  
		  mcosysusr.filtersearch();
		  
		  mcosysusr.expanddatadetails("USER ID", user_id);
		  
		  mcosysusr.checkADMINperm();
		
//	}

//	@Test
//	public void addUserrole() {
//		
//		Home home = new Home(getDriver());
//		  
//		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
//		  
//		MCOHomepage mcohomepg = mcologinpg.Login(get_encryptedMCOUsername(),
//		  get_encryptedMCOPassword());
//		  
//		MCOMaster mstrpg = mcohomepg.navigate_Master();
		  
		MCOUserRoles mcousrrle = mstrpg.click_UserRoles();
		
		Map<String, String> rolemap = SYSUSRdatareader.getuserrole();
		
		mcousrrle.searchUserrole(rolemap.get("ROLE"),user_id);
		
//	}
//	
//	@Test
//	public void selectfunctiongroup() {
//		
//		Home home = new Home(getDriver());
//		  
//		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
//		  
//		MCOHomepage mcohomepg = mcologinpg.Login(get_encryptedMCOUsername(),
//		  get_encryptedMCOPassword());
//		  
//		MCOMaster mstrpg = mcohomepg.navigate_Master();
		
		MCOFunctionalGroup funcgrp = mstrpg.click_FunctionalGroup();
		
		Map<String, String> funcgrpmap = SYSUSRdatareader.getfuncgrp();
		
		Map<String, String> datamap1 = SYSUSRdatareader.getuserdata();
		
		String LastName = datamap1.get("LastName");
		
		String FirstName = datamap1.get("FirstName");
		
		String Username = LastName+", "+FirstName;
		
		for(int i = 1; i<=funcgrpmap.size(); i++) {
		
			funcgrp.selectFunctionlGroup(funcgrpmap.get("Functional Group"+i), 
					Username);
		
		}
	}
	
}
