package JavaPrograms;

import org.testng.annotations.Test;

public class CheckPrimeOrNot 
{
	//2 is the lowest prime number
	public static boolean isPrimeNumber(int num)
	{
		//edge case corner
		if(num<=1)
		{
			return false;
		}
		for(int i = 2; i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num)
	{
		for(int i =2;i<=num;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i+ " ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("2 is prime number : "+isPrimeNumber(2));
		System.out.println("1 is prime number : "+isPrimeNumber(1));
		System.out.println("3 is prime number : "+isPrimeNumber(3));
		
		getPrimeNumbers(20);
	}
	

}
