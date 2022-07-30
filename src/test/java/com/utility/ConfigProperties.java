package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProperties 
{
	Properties properties;

	public ConfigProperties() 
	{
		File src = new File("./config/Config.properties");

		try 
		{
			FileInputStream fis = new FileInputStream(src);

			properties = new Properties();

			properties.load(fis);
			
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to load the config property file");
		}

	}

	public String getKey(String key) 
	{
		return properties.getProperty(key);
	}
}
