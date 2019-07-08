package com.Test_base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Testbase {
		
	
	 public static WebDriver driver;
	 public static String pathofchromedriver = "E:/project/Driver/driver1";
	 public static Properties OR=null;
	 
	 	public Testbase() throws IOException{
	 		
	 		
	 		OR= new Properties();
	 		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//com//Test//Config/OR.properties");
	 		System.out.println("inside setup"+System.getProperty("user.dir")+"//src//com//Test//Config/OR.properties");
			OR.load(ip);
	 	}
	 	//  Opening the browser
	    public void Setup(String browser,String baseurl) {
	        System.out.println("Test one suite param is: " + baseurl+"--"+browser);
	        if(browser.equals("Mozilla"))
			 {
				 	driver = new FirefoxDriver();
				 	driver.get(baseurl);
			 }
			 else  if (browser.equals("IE"))
			 {	
				DesiredCapabilities capabilities = new DesiredCapabilities();
				 driver = new InternetExplorerDriver();	
				 driver.get(baseurl);
			 }
			 else if  (browser.equalsIgnoreCase("CHROME"))
			 {	 
				 System.out.println(browser);
				 System.setProperty("webdriver.chrome.driver","E:\\project\\Driver\\driver1\\chromedriver.exe");
				 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("test-type");
					/*capabilities
							.setCapability("chrome.binary",
									"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");*/
					capabilities.setCapability(ChromeOptions.CAPABILITY, options);

					//driver = new ChromeDriver(capabilities);
				 System.out.println(System.setProperty(baseurl, baseurl));
				 driver= new ChromeDriver();
				 driver.get(baseurl);
				 driver.manage().window().maximize();
				 driver.manage().deleteAllCookies();
				 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				 	 
			 }
		}
	 
	 
	 
}
