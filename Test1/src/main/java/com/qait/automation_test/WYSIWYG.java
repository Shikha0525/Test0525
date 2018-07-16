package com.qait.automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WYSIWYG {

	WebDriver driver;
	public WYSIWYG(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void test() {
		driver.get(" http://10.0.31.161:9292/");
		driver.findElement(By.linkText("WYSIWYG Editor")).click();
		WebElement editor=driver.findElement(By.xpath("//*[@id=\"mceu_13-body\"]"));
		boolean ActualResult = editor.isDisplayed();
		Assert.assertTrue(ActualResult);
	}
	public void text() {
		
	    driver.switchTo().frame("mce_0_ifr");
	    driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).clear();
	    driver.findElement(By.id("tinymce")).sendKeys("QA Infotech");
	    driver.findElement(By.id("tinymce")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	   
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//*[@id=\"mceu_3\"]/button/i")).click();
	    driver.switchTo().frame("mce_0_ifr");
	    String Expected="QA Infotech";
	    String Actual=driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p/strong")).getText();
	    System.out.println(Actual);
	    Assert.assertEquals(Actual, Expected);
	}
	

}
