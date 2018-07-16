package com.qait.automation.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.qait.automation.Selenium.BrowserFactory;

public class PageFactory1 {

	@FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[1]") WebElement listusers;
	@FindBy(id="users-single") WebElement singleusers;
	@FindBy(id="users-single-not-found") WebElement userssinglenotfound;
	@FindBy(id="unknown") WebElement unknown;
	@FindBy(id="unknown-single") WebElement unknownsingle;
	@FindBy(id="unknown-single-not-found") WebElement unknownsinglenotfound;
	@FindBy(id="post") WebElement post;
	@FindBy(id="put") WebElement put;
	@FindBy(id="patch") WebElement patch;
	@FindBy(id="delete") WebElement delete;
	@FindBy(id="register-successful") WebElement registersuccessful;
	@FindBy(id="register-unsuccessful") WebElement registerunsuccessful;
	@FindBy(id="login-successful") WebElement loginsuccessful;
	@FindBy(id="login-unsuccessful") WebElement loginunsuccessful;
	@FindBy(id="delay") WebElement delay;
	@FindBy(xpath="//*[@id=\"console\"]/div[2]/div[2]/p/strong/span") private WebElement userListResponse;
	@FindBy(className="url") private WebElement geturl;
	
	WebDriver driver;
	
	public PageFactory1(WebDriver driver) {
		
		this.driver=driver;
		PageFactory
		
	}
	
	public void listusers(){
		
		listusers.click();
		String actual="/api/users?page=2";
		String expected=geturl.getText();
		System.out.println(expected);
		String response=userListResponse.getText();
		System.out.println("ListUser:"+response);
		Assert.assertEquals(actual, expected);
	}
	
	public void singleusers(){
		
		singleusers.click();
	}
	
	public void userssinglenotfound(){
		
		userssinglenotfound.click();
	}
	
	public void unknown(){
		
		unknown.click();
	}
	
	public void unknownsingle(){
		
		unknownsingle.click();
	}
	
	public void unknownsinglenotfound(){
		
		unknownsinglenotfound.click();
	}
	
	public void post(){
		
		post.click();
	}
	
	public void put(){
		
		put.click();
	}
	
	public void patch(){
		
		patch.click();
	}
	
	public void delete(){
		
		delete.click();
	}
	
	public void registersuccessful(){
		
		registersuccessful.click();
	}
	
	public void registerunsuccessful(){
		
		registerunsuccessful.click();
	}
	
	public void loginsuccessful(){
		
		loginsuccessful.click();
	}
	
	public void loginunsuccessful(){
		
		loginunsuccessful.click();
	}
	
	public void delay(){
		
		delay.click();
	}
	public void launchHomePage(String string) {
		driver.get(string);
		
	}
	
}