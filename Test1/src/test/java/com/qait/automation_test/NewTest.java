package com.qait.automation_test;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.AfterTest;

public class NewTest {
  
	WebDriver driver;
	BasicAuth basic;
	BrokenImages Broken_Image;
	Exit_intent exit_intent;
	Login_Form login;
	Tables table;
	Status_code sc;
	WYSIWYG w;
	Login_Form2 login2;
	
	public NewTest() {
		
		String exepath = "/home/qainfotech/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver",exepath);
		driver = new ChromeDriver();
		basic=new BasicAuth(driver);
	}
	
	
	
	@Test
	public void test01BasicAuth() throws InterruptedException {
		
		basic.Test();
		
    }
	
	@Test
	public void test02BrokenImages() {
		
		Broken_Image=new BrokenImages(driver);
		Broken_Image.checkBrokenImage();
	}
	
	@Test
	public void test03exit_intent() throws AWTException, InterruptedException {
	
		exit_intent=new Exit_intent(driver);
		exit_intent.checkExitIntentPageIsDisplayed();
	    exit_intent.hoverMouseOverPage();
	    exit_intent.displayPopup();
	}
	
    @Test
	public void test04table() {
		
		table=new Tables(driver);
		table.test();
		table.sort();
		
	}
    
    @Test
    public void test05status_code() {
    	
    	sc=new Status_code(driver);
    	sc.test();
    	sc.check404status();
    	sc.checkhttp404status();
    }
    
    @Test
    public void test06WYSIWYG() {
    	
    	w=new WYSIWYG(driver);
    	w.test();
    	w.text();
    	
    }
    @Test
    public void test07login() {
    	
    	login=new Login_Form(driver);
    	login.test();
    	login.InvalidCredentials();
    	
    	
    }
    @Test
    public void test08login2() {
    	
    	login2=new Login_Form2(driver);
    	login2.test();
    	login2.validCredentials();
    }
	
    
	
}
