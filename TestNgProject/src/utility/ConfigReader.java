package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{

	public static String readData(String propertyName) throws IOException
	{
		String projectPath = System.getProperty("user.dir");
		String path = "\\src\\config.properties";
		String filePath = projectPath + path;

		FileInputStream file = new FileInputStream(filePath); // to let java know about the file
		Properties prop = new Properties();
		prop.load(file); 			// open the file

		String propertyValue = prop.getProperty(propertyName);  
		System.out.println(propertyValue);
		
		return propertyValue;
	}
	
}
