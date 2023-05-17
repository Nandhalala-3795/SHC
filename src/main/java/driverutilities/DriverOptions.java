package driverutilities;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

class DriverOptions {

	private DriverOptions() {}
	
	private static ChromeOptions chromeoptions = new ChromeOptions();
	
	private static EdgeOptions edgeoptions = new EdgeOptions();
	
	private static FirefoxOptions firefoxoptions =  new FirefoxOptions();
	
	static {
		chromeoptions.addArguments("--remote-allow-origins=*");
		edgeoptions.addArguments("--remote-allow-origins=*");
		firefoxoptions.addArguments("--remote-allow-origins=*");
	}

	public static ChromeOptions getChromeoptions() {
		return chromeoptions;
	}

	public static EdgeOptions getEdgeoptions() {
		return edgeoptions;
	}

	public static FirefoxOptions getFirefoxoptions() {
		return firefoxoptions;
	}
	
	
	
}
