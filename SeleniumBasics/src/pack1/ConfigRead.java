package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead
{

	public static void main(String[] args) throws IOException
	{

		// provide path

		String projectPath = System.getProperty("user.dir");
		String path = "\\src\\config.properties";
		String filePath = projectPath + path;

		FileInputStream file = new FileInputStream(filePath); // to let java know about the file
		Properties prop = new Properties();
		prop.load(file); 			// open the file

		String userID = prop.getProperty("BrowserType");  
		System.out.println(userID);

	}

}
