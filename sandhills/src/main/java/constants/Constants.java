package constants;

/**
 * 
 * @author Alphi-Nandhalala
 * Contains values that will remain constant through entire project
 *
 */

public interface Constants {

	String ProjectPath = System.getProperty("user.dir");
	
	String MainResourcesPath = ProjectPath+"/src/main/resources";
	
	String TestResourcespath = ProjectPath+"/src/test/resources";
	
	String ScreenShotsPath = ProjectPath+"/ScreenShots";
	
	String ReportsPath = ProjectPath+"/Reports";
	
	String ConfigFilePath = TestResourcespath+"/config.properties";
	
}
