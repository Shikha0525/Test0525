package com.qait.automation.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	static WebDriver driver;
	
	public static WebDriver startWebBrowser(String browserName,String url){
		
		if(browserName.equalsIgnoreCase("firefox")){
			
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chorme")){
			
			driver=new ChromeDriver();
		}
		
		else{
			
			driver=new ChromeDriver();
		}
		
		return driver;
		
	}
	
}