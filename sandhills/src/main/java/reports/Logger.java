package reports;

import org.testng.Reporter;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import constants.ConfigurationValues;
import fileReaders.ConfigurationReader;
import screenshots.ScreenShot;

/**
 * Logger class to log the information in the report
 * @author Alphi-Nandhalala
 *
 */
public final class Logger {
	
	private Logger() {}

	/**
	 * This method is to log pass status with pass message
	 * @param message
	 */
	public static void LogPass(String message) {
		if(ConfigurationReader.get(ConfigurationValues.passedstepsscreenshots).toString()
				.equalsIgnoreCase("yes")) {
			
			Reporter.log("----[PASS]----"+message, true);
			//Reporter.log(ScreenShot.encodeforreport());
			ReportManager.getExtentTest()
			.log(Status.PASS, MarkupHelper.createLabel(message, ExtentColor.GREEN));
			
			Reporter.log("----[PASS]----"
			+"\n"+"<br><img src = \" "+ScreenShot.TakeScreenshot("report")+"\" width = 800 length = 800/</br>");
			
			
			ReportManager.getExtentTest()
			.log(Status.PASS,
					MediaEntityBuilder
					.createScreenCaptureFromPath(ScreenShot.TakeScreenshot("extent")).build());
			
			
		}
		else {
			Reporter.log("----[PASS]----"+message, true);
			ReportManager.getExtentTest()
			.log(Status.PASS, MarkupHelper.createLabel(message, ExtentColor.GREEN));
		}
	}
	
	/**
	 * This method is to log fail status with fail message
	 * @param message
	 */
	public static void LogFail(String message) {
		if(ConfigurationReader.get(ConfigurationValues.failedstepsscreenshots).toString()
				.equalsIgnoreCase("yes")) {
			
			Reporter.log("----[FAIL]----"+message, true);
			//Reporter.log(ScreenShot.encodeforreport());
			ReportManager.getExtentTest()
			.log(Status.FAIL, MarkupHelper.createLabel(message, ExtentColor.RED));
			
			Reporter.log("----[FAIL]----"+message+"\n"+ScreenShot.TakeScreenshot("report"), true);
			ReportManager.getExtentTest()
			.log(Status.FAIL, 
					MediaEntityBuilder
					.createScreenCaptureFromPath(ScreenShot.TakeScreenshot("extent")).build());
			
	
			
		}
		else {
			Reporter.log("----[FAIL]----"+message, true);
			ReportManager.getExtentTest()
			.log(Status.FAIL, MarkupHelper.createLabel(message, ExtentColor.RED));
		}
	}
	
	/**
	 * This method is to log Info status with info message message
	 * @param message
	 */
	public static void LogInfo(String message) {
		Reporter.log("----[INFO]----"+message, true);
		ReportManager.getExtentTest().log(Status.INFO, 
				MarkupHelper.createLabel(message, ExtentColor.BLUE));
	}
	
	/**
	 * This method is to log warn status with warning message
	 * @param message
	 */
	public static void LogWarn(String message) {
		Reporter.log("----[WARN]----"+message, true);
		ReportManager.getExtentTest().log(Status.WARNING, 
				MarkupHelper.createLabel(message, ExtentColor.ORANGE));
	}
	
}
