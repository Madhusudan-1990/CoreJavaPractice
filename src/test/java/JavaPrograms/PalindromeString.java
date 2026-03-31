package JavaPrograms;

public class PalindromeString 
{
	
	public static void checkPalindrome(String input)
	{
		
		String reverse = "";
		int len = input.length();
		for(int i = len-1;i>=0;i--)
		{
			reverse = reverse+input.charAt(i);
		}
		if(reverse.equals(input))
		{
			System.out.println("Given String is a Palindrome");
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}

	}
	
	public static void main(String [] args)
	{
		checkPalindrome("MALAYALAM");
	}

}
