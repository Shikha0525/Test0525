package com.qait.automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Status_code {
	
	WebDriver driver;
	public Status_code(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void test() {
		
		driver.get(" http://10.0.31.161:9292/");
		driver.findElement(By.linkText("Status Codes")).click();
		String url="http://10.0.31.161:9292/status_codes";
//		if(url.equals(driver.getCurrentUrl())) {
//			
//			System.out.println("Data Table page is displayed");
//			
//		}
		Assert.assertEquals(driver.getCurrentUrl(), url);
	}
	public void check404status() {
		
		Assert.assertTrue(driver.getPageSource().contains("404"));
		System.out.println("Contain 404 error");
	}
	public void checkhttp404status() {
		//String url="http://10.0.31.161:9292/status_codes/404";
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/a")).click();
		String actual=driver.getCurrentUrl();
		String expected="http://10.0.31.161:9292/status_codes/404";
		Assert.assertEquals(actual, expected);
		
	}
	
	
	

	
	

}
