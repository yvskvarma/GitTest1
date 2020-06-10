package sample;

import org.testng.annotations.Test;

public class DependsGroups {

	@Test(groups = {"ViewAcc"})
	public void ViewAcc() {
		
		System.out.println("This is View Accoutn");
		
	}
	
	@Test(groups = {"loginAcc"})
	public void loginAcc() {
		
		System.out.println("This is Login Accoutn");
		
	}
	
	@Test(groups = {"logout"})
	public void logout() {
		
		System.out.println("This is Logout accout");
		
	}
	
	@Test(groups = {"closeBroser"})
	public void closeBroser() {
		
		System.out.println("This is Close browser");
		
	}
}
