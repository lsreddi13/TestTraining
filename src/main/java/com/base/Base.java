package com.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.TestCutomListeners;

public class Base {
	
	public static WebDriver driver;
	static Logger log = Logger.getLogger(Base.class);
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", ".//src//main//resources//Browser_Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		log.info("browser lanched.");
		
	}
	
	/*
	 * 
	 */
	public void screenShot(String method) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(src, new File(".//Sceenshots//"+method+"_"+timestamp()+".png"));
		//File dest = new File(".//Sceenshots//"+method+"_"+timestamp()+".png");
	}
	
	
	//It will print current timestamp with the mentioned format.
	public String timestamp() {
		return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
	}
}
