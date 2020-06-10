package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@Test(dataProvider = "getData")
	public void test(String uname, String pwd, String res) {
		
		System.out.println(uname);
		System.out.println(pwd);
		System.out.println(res);
		
		System.out.println();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][3];
		
		data[0][0] = "user1";
		data[0][1] = "pwd1";
		data[0][2] = "res1";
		
		data[1][0] = "user2";
		data[1][1] = "pwd2";
		data[1][2] = "res2";
		
		data[2][0] = "user3";
		data[2][1] = "pwd3";
		data[2][2] = "res3";
	
		return data;
		
	}

}
