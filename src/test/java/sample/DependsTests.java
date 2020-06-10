package sample;

import org.testng.annotations.Test;

public class DependsTests {

	@Test (dependsOnMethods = {"OpenBrowser"})
	public void loginTest() {
		
		System.out.println("This is Login Test");
		
	}
	
	@Test
	public void OpenBrowser() {
		
		System.out.println("This is Open Browser Test");
	}
	
	@Test()
	public void closeBrowser() {
		
		System.out.println("This is Close Browser Test");
		System.out.println();
		
	}
}
