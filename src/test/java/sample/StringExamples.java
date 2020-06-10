package sample;

import org.testng.annotations.Test;

public class StringExamples {
	
	
	@Test()
	public void nulEx() {
		
		/*
		 * String str = null; str = new String ("Java");
		 * 
		 * System.out.println(str.length());
		 */
		
		String str = "Hello";
		
		String str1 = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			//System.out.println(str.charAt(i));
			str1 = str1+str.charAt(i);
		}
		System.out.println(str1);
	}
	
	@Test
	public void paland() {
		int n = 1221;
		int r=0, temp;
		
		temp = n;
		
		while(n!=0) {
			r = r*10;
			r = r+n%10;
			n = n/10;
		}
		
		System.out.println("reverse no : "+r);
		if(r==temp) {
			System.out.println("Palandrom");
		}
		
	}

	
	
}
