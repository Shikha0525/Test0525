package com.qait.automation.ReqRes;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
	
	
      public static RemoteWebDriver driver1;
      
	
     
      HomePage homepage;
      ListUsers listuser;
      String baseURL, nodeURL;
  
      public RemoteWebDriver driver;
  	  public static String appURL = "http://www.google.com";
  	  
     @BeforeClass
	 public void setUp() throws MalformedURLException {
		
  		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://10.0.24.136:4444/wd/hub"), capabilities);
		driver.manage().window().maximize();
     }
 
     @Test
     public void homepage() {
    	 
    	 String exepath = "/home/qainfotech/Downloads/chromedriver";
         System.setProperty("webdriver.chrome.driver",exepath);
    	 driver.get(appURL);
     }
}
