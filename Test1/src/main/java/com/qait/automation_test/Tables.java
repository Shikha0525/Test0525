package com.qait.automation_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Tables {

	WebDriver driver;
	public Tables(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void test() {
		
		driver.get(" http://10.0.31.161:9292/");
		WebElement data_table=driver.findElement(By.linkText("Sortable Data Tables"));
		data_table.click();
		String url="http://10.0.31.161:9292/tables";
//		if(url.equals(driver.getCurrentUrl())) {
//			
//			System.out.println("Data Table page is displayed");
//			
//		}
		//WebElement Due=driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[4]/span"));
		Assert.assertEquals(driver.getCurrentUrl(), url);
		
	}
	public void sort() {
		
		driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[4]/span")).click();
		
		
	}
    
	
	
}
