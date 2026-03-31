package JavaPrograms;

public class PalindromeNumber 
{
	
	public static void  isPalindromeNumber(int num)
	{
		int remainder = 0;
		int sum = 0;
		int temp;
		temp = num;
		
		while(num>0)
		{
			remainder = num%10; //Get the remainder
			sum = (sum*10)+remainder;
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is a palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
		
	}
	
	public static void main(String[] args)
	{
		isPalindromeNumber(121);
		isPalindromeNumber(122);
		isPalindromeNumber(5433345);
	}

}
