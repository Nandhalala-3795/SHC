package test;

import java.util.Map;

import base.BaseClass;
import fileReaders.SYSUSRdatareader;
import pompages.Home;
import pompages.MCOHomepage;
import pompages.MCOLoginpage;
import pompages.MCOMaster;
import pompages.MCOUserRoles;

public class Test extends BaseClass {

//	@org.testng.annotations.Test
//	public void test() {
//		Home home = new Home(getDriver());
//		  
//		MCOLoginpage mcologinpg = home.ClickMCOloginlink();
//		  
//		MCOHomepage mcohomepg = mcologinpg.Login(get_encryptedMCOUsername(),
//		  get_encryptedMCOPassword());
//		  
//		MCOMaster mstrpg = mcohomepg.navigate_Master();
//		  
//		MCOUserRoles mcousrrle = mstrpg.click_UserRoles();
//		
//		Map<String, String> rolemap = SYSUSRdatareader.getuserrole();
//		
//		System.out.println(rolemap.get("ROLE"));
//		
//		mcousrrle.searchUserrole(rolemap.get("ROLE"),"20491");
//	}

	public static void main(String[] args) {
		
		Map<String, String> datamap = SYSUSRdatareader.getfuncgrp();
		
		System.out.println(datamap);
		
		System.out.println(datamap.size());
		
		for(int i = 1; i<=datamap.size(); i++) {
			
			System.out.println("click");
		
		}
		
	}
	
}
