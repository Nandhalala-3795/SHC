package reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentTest;

/**
 * 
 * @author Alphi-Nandhalala
 *
 */
public class ReportManager {

	private ReportManager() {}

	/**
	 * For thread safety using this variable
	 */
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>() ;
	
	/**
	 * returns the extent test from thread safe variable
	 * @return
	 */
	static ExtentTest getExtentTest() {
		return extentTest.get();
	}
	
	/**
	 * This method Set the extent test value to thread safe variable
	 * @param test
	 */
	static void setExtentTest(ExtentTest test) {
		if(Objects.nonNull(test)) {
		extentTest.set(test);
		}
	}
	
	/**
	 * This method removes extent test from thread safe variable
	 */
	static void unload() {
		extentTest.remove();
	}
	
}
