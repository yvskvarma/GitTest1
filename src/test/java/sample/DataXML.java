package sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataXML {
  @Test
  @Parameters("usernames")
  public void f(String uname) {
	  
	  System.out.println(uname);
  }
}
