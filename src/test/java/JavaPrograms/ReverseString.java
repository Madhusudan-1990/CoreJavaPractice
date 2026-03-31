package JavaPrograms;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	public void reverseString()
	{
	 String input = "Selenium";
	 int len = input.length(); //8
	 String reverse = "";
	 
	 for(int i = len-1;i>=0;i--) // len-1  = 7(index)
	 {
		 reverse = reverse + input.charAt(i);
	 }
	 
	 System.out.println("Reverse String using String Class : "+reverse);
	}
	
	
	@Test
	public void reverseStringUsingStringBuffer()
	{
		
		StringBuffer buffer = new StringBuffer("Selenium");
		System.out.println(" Reverse String using String Buffer : "+buffer.reverse());
	}
	

}
