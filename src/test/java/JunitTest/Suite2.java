package JunitTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suite2 {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREM\\eclipse-workspace\\prem\\Automation\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("premkum");	
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		
		
	}
}
