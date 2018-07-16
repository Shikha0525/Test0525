package mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class mainfunction {
WebDriver driver;
public mainfunction(WebDriver driver) {
	this.driver=driver;
	
}

public void set_connection() {
	driver.findElement(By.linkText("http://10.0.31.161:9292/")).click();
	System.out.println("link clicked");
}

public void click_basic_auth() {
	driver.findElement(By.linkText("Basic Auth")).click();
}
public void click_broken_images() {
	driver.findElement(By.linkText("Broken Images"));
}
public void void_check_pictures() {
	Assert.assertEquals(driver.findElement(By.cssSelector("")).isDisplayed(),true );
}
public void check_extent() {
	
	Assert.assertEquals(driver.findElement(By.linkText("Exit Intent")).isDisplayed(),true );
	driver.findElement(By.linkText("Exit Intent")).click();
}
public void check_popup() {
	Assert.assertTrue(driver.findElement(By.cssSelector("#ouibounce-modal > div.modal > div.modal-body")).isDisplayed());
}
public void click_sorted_data_tables() {
	driver.findElement(By.linkText("Sorted Data Tables")).click();
	driver.findElement(By.xpath("table[@id='table1']/th[@class='header headerSortUp']")).click();
}
public void form_authentication() {
	Assert.assertEquals(driver.findElement(By.linkText("Form Authentication")).isDisplayed(),true);
	Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	driver.findElement(By.id("username")).sendKeys("dfg");
	driver.findElement(By.id("password")).sendKeys("dgt");
	Assert.assertEquals(driver.findElement(By.className("flash error")).isDisplayed(),true);
}

}
