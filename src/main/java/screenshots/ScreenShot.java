package screenshots;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driverutilities.DriverManager;

public class ScreenShot {

	private static String encodedBase64 = null;
	private static FileInputStream fis = null;
	private static File destination = null;
	
	public static String TakeScreenshot(String reporttype) {
		try {
			String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
			TakesScreenshot takesScreenshot = (TakesScreenshot) DriverManager.getDriver();
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			String destinationPath = constants.Constants.SCREENSHOTSPATH+"/Screenshot "+dateName+".png";
			destination = new File(destinationPath);
			FileUtils.copyFile(source, destination);
			try {
		        fis =new FileInputStream(destination);
		        byte[] bytes =new byte[(int)destination.length()];
		        fis.read(bytes);
		        encodedBase64 = new String(org.apache.commons.codec.binary.Base64.encodeBase64String(bytes));
		        fis.close();
		    }catch (FileNotFoundException e){
		        e.printStackTrace();
		    } catch (IOException e) {
				
				e.printStackTrace();
			}
			if(reporttype.equals("extent"))
				return destinationPath;
			else
				return "data:image/png;base64,"+encodedBase64;
			}catch(Exception e) {
				
				e.printStackTrace();
				return null;
			}
	}

	
	public static String encodeforreport() {
		
		try {
	        fis =new FileInputStream(destination);
	        byte[] bytes =new byte[(int)destination.length()];
	        fis.read(bytes);
	        encodedBase64 = new String(org.apache.commons.codec.binary.Base64.encodeBase64String(bytes));

	    }catch (FileNotFoundException e){
	        e.printStackTrace();
	    } catch (IOException e) {
			
			e.printStackTrace();
		}
	
	return "data:image/png;base64,"+encodedBase64;

	}
	
	
}
