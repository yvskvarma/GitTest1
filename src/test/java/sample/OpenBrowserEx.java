package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserEx {
	@Test
	public void f() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varma\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver.get("http://www.google.com");

		String poorna = driver.getTitle();

		System.out.println("Page Title :" + poorna);
		
		driver.close();

	}
}
