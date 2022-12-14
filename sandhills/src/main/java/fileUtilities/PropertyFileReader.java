package fileUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/**
 * 
 * @author Alphi-Nandhalala
 * This class is used to read data from property file
 *
 */
public class PropertyFileReader {

	/**
	 * property variable to fetch data
	 * Map to store property value in key and value pair
	 */
	private static Properties property = new Properties();
	private static final Map<String, String> configmap = new HashMap<String, String>();
	
	/**
	 * Constructor with file parameter
	 * @param propertyfile
	 */
	public PropertyFileReader(File propertyfile) {
		try(FileInputStream file = new FileInputStream(propertyfile)) {
			property.load(file);
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				configmap.put(String.valueOf(entry.getKey()), 
						String.valueOf(entry.getValue()).trim()); 
			}
		} catch (IOException e) {
			e.printStackTrace();
			//System.exit(0);
		} 
	}
	
	/**
	 * Constructor with string parameter
	 * @param propertyfilepath
	 */
	public PropertyFileReader(String propertyfilepath) {
		try(FileInputStream file = new FileInputStream(new File(propertyfilepath))) {
			property.load(file);
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				configmap.put(String.valueOf(entry.getKey()), 
						String.valueOf(entry.getValue()).trim()); 
			}
		} catch (IOException e) {
			e.printStackTrace();
			//System.exit(0);
		} 
	}
	
	/**
	 * This method is to get value from property file for given key
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String get(String key) throws Exception  {
		if (Objects.isNull(key) || Objects.isNull(configmap.get(key.toLowerCase()))) {
			throw new Exception("Property name " + key + " is not found. "
					+ "Please check config.properties");
		}
		return configmap.get(key.toLowerCase());
	}
	
}
