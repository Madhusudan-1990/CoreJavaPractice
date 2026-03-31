package Strings;

/*
 * When you are asked to write a string program, always consider below testcases apart from positive  testcase
 * Null Check
 * Length Check
 * With Space
 * 
 */

public class StringReverse 
{
	
	public static String reverse(String str)
	{
		//null check
		if(str == null)
		{
			throw new RuntimeException("Value cannot be null !!!"); // TestCase 1
		}
		//length ==1 or 0
		if(str.length() == 1 )//(TestCase 2) // If the string length is 1 just return it as it is instead of making it to pass through for loop. This is better optimizing
		{
			return str;
		}
		String rev ="";
		int strLen = str.length();
		for(int i = strLen-1; i>=0;i--)
		{
			rev = rev+str.charAt(i); // muineless 
			//rev = muineless
		}
		return rev;
	}
	public static void main(String [] args)
	{
		// Reverse a string selenium
		
		
		System.out.println(reverse("selenium")); //Positive Test Case 1
		
		System.out.println(reverse("t")); //Negative Test Case 2
		
//		System.out.println(reverse(null));  //Negative Test Case 3
		
		System.out.println(reverse("")); //Negative Test Case 4
		System.out.println(reverse(" "));//Negative Test Case 5
		System.out.println(reverse("123")); //321
		System.out.println(reverse("null"));//llun
		
		 
		
	}

}
