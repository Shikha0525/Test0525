package testcases;
import mainclass.mainfunction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.
import org.testng.annotations.Test;

public class tests {
	mainfunction mf;
	WebDriver driver;
	public tests() {
	
	
	}
@ Test
public void test_connection() {

	mf=new mainfunction(driver);
	System.setProperty("chromewebdriver", "/home/qainfotech/Downloads/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
}}
