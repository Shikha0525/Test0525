package com.qait.automation.ReqRes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListUsers {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[1]") private WebElement getUserName;
	@FindBy(className="response-code") private WebElement getResponse;
	
	public ListUsers(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

	public void displayUserName() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		getUserName.click();
		
		
	}

}
