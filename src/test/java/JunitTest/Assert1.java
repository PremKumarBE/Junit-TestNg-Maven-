package JunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Assert1 {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREM\\eclipse-workspace\\prem\\Automation\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		Assert.assertTrue(driver.getCurrentUrl().contains("http"));
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("prem");	
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");
	}
	@Test
	public void test2() {
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");
		Assert.assertEquals(password.getAttribute("value"),("123456"));
		WebElement login = driver.findElement(By.name("login"));
		login.click();

		
		
		
	}

}

