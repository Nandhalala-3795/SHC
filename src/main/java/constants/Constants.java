package constants;

/**
 * 
 * @author Alphi-Nandhalala
 * Contains values that will remain constant through entire project
 *
 */

public interface Constants {

	String PROJECTPATH = System.getProperty("user.dir");
	
	String MAINRESOURCESPATH = PROJECTPATH+"/src/main/resources";
	
	String TESTRESOURCESPATH = PROJECTPATH+"/src/test/resources";
	
	String SCREENSHOTSPATH = PROJECTPATH+"/ScreenShots";
	
	String REPORTSPATH = PROJECTPATH+"/Reports";
	
	String CONFIGFILEPATH = TESTRESOURCESPATH+"/config.properties";
	
}
