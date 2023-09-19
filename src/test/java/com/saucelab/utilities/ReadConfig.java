package com.saucelab.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String filePath= "D:\\Manish\\FrameworkAugust630\\Configuration\\Config.properties";
	
	//create constructor
	
	public ReadConfig(){
		
		try{
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filePath);
			properties.load(fis);
			
		}catch(Exception e){
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
	// method to read key value from the property file.
	
	public String getBaseUrl(){
		String value = properties.getProperty("url");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("URL in Property file not found");
	}
	
	public String getBrowser(){
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser in Property file not found");
	}

}
