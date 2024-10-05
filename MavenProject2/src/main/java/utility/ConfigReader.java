package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{

	/*
	 * Desc: Method to get the value from config.peropeerties file
	 * Return: returns String if property name is correct, else return null.
	 * Arguments: propertyName, String type property from config.peropeerties file
	 */
	public static String readData(String propertyName) throws IOException
	{
		String projectPath = System.getProperty("user.dir");
		String path = "\\config.properties";
		String filePath = projectPath + path;

		FileInputStream file = new FileInputStream(filePath); // to let java know about the file
		Properties prop = new Properties();
		prop.load(file); 			// open the file

		String propertyValue = prop.getProperty(propertyName);  
		
		return propertyValue;
	}
	
}
