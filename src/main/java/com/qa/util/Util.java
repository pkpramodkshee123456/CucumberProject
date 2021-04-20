package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
	
	
	FileInputStream file;
	Properties prop;
	public Util() throws FileNotFoundException
	{
		file=new FileInputStream("");
		prop=new Properties();
		
	}
	
	
	

	
	public  void configReader() throws IOException
	{
		prop.load(file);
	String bname=	prop.getProperty("browser");

		 
		
		
	
	}

}
