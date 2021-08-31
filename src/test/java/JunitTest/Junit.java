package JunitTest;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit { 
	static WebDriver driver;
	@BeforeClass
	public static void launch(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREM\\eclipse-workspace\\prem\\Automation\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	@Before
	public void date() {
		Date a=new Date();
		System.out.println(a);
	}
	@After
	public void date2() {
		Date a=new Date();
		System.out.println(a);
	}
	@AfterClass
	public static void quit() {
	    driver.quit();
	}
	@Test
	public void test() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("prem");	
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");
	}
	@Ignore     // ignore
	@Test 
	public void test2() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
