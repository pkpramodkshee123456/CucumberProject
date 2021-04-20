package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.output.AbstractByteArrayOutputStream;
import org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class TestBase {

	FileInputStream file;
	Properties prop;
	WebDriver driver;
	public TestBase()
	{
		try {
			file=new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found");
			
		}
	prop=new Properties();
		
		
		
	}
	
	public void initialization() throws IOException
	{
		prop.load(file);
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("","");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("","");
			driver=new FirefoxDriver();
		}
		
		else {
			System.out.println("please select the browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("passsword"));
		driver.findElement(By.xpath("")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
		
}
	
		
	
	
	
	
	
	


