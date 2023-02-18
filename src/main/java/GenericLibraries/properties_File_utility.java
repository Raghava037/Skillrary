package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class contains all reusable method to perform operation on properties file
 * @author Monikrish
 *
 */
public class properties_File_utility 
{
	private Properties property;
	/**
	 * This method is used to initialize properties file
	 * @param filepath
	 */
	public void propertieFileinitialization(String filepath)
	{
		FileInputStream fis=null;
		try 
		{
		 fis=new FileInputStream(filepath);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		property=new Properties();
		try {
			property.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param key
	 * @return
	 */
		public String featchproperties(String key)
		{
			return property.getProperty(key);
		}
	}

