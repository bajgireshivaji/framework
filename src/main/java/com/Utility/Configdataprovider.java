package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;



public class Configdataprovider {
	Properties pro;
         public Configdataprovider() throws Exception {
        	 String path="C:\\Users\\LENOVO\\eclipse-workspace\\eclips data\\Framework\\Config\\Config.properties";
        	 
        	 FileInputStream fis=new FileInputStream(path);
        	  pro=new Properties();
        	  pro.load(fis);
        	 
         }
	
	public String getBaseUrl_QA1() {
		return pro.getProperty("getBaseUrl_QA1");
	}
	public String getBaseUrl_QA2() {
	return	pro.getProperty(getBaseUrl_QA2());
	}
	
	
	
}
