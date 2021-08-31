package JunitTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.FindElements;

public class Suite1{
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
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("prem");	
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");
	}
	@Test
	public void test2() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();

		
		
		
	}

}
