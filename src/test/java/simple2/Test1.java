package simple2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	public static WebDriver driver;
	
	@Test
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	}
	
	@Test(dependsOnMethods = {"setup"})
	public void EnterText() {
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
	}
	
}
