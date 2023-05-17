package fileReaders;

import constants.ConfigurationValues;
import constants.Constants;
import fileUtilities.PropertyFileReader;

/**
 * Configuration file reader to read configuration property file
 * @author Alphi-Nandhalala
 *
 */
public class ConfigurationReader {

	private static PropertyFileReader p = new PropertyFileReader(Constants.CONFIGFILEPATH);
	
	/**
	 * get property data
	 * @param configvalues
	 * @return
	 */
	public static String get(ConfigurationValues configvalues) {
		try {
			return p.get(configvalues.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
