package reports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import constants.Constants;

/**
 * 
 * @author Alphi-Nandhalala
 *
 */
public class Reports {

	private Reports() {}
	
	private static ExtentReports extent;
	
	/**
	 * This method is used to initialize the extent reports
	 */
	public static void initReports() {
		if(Objects.isNull(extent)) {
			String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
			File file = new File(Constants.REPORTSPATH+"/Report "+dateName+".html");
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(file); 
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("Sandhills Report");
		}
	}
	
	/**
	 * This method is use to flush extent reports
	 */
	public static void flushReports(){
		if(Objects.nonNull(extent)) {
			extent.flush();
		}
		ReportManager.unload();
	}
	
	/**
	 * Create test node in report
	 * @param testcasename
	 */
	public static void createTest(String testcasename) {
		ReportManager.setExtentTest(extent.createTest(testcasename));
	}
	
}
