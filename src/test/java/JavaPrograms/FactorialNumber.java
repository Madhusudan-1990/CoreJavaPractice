package JavaPrograms;

import org.testng.annotations.Test;

public class FactorialNumber 
{
	// Factorial of 3 = 3*2*1 = 6
	// Factorial of 5 = 5*4*3*2*1 = 120

	
	// 1. Factorial of Number using Loop
	public static int factorialOfNumberWithLoop(int num)
	{
		int fact = 1;
		if(num==0)
		{
			return 1;
		}
		for(int i = 1; i<=num;i++)
		{
			fact = fact * i; // 1*2*3*4
		}
		System.out.println("Factorial of number using loop : " +fact );
		return fact;
		
		
	}
	
	// 2. Factorial of Number using Recursive Function(Function calling itself)
	public static int factorialOfNumberUsingRecursion(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			return (num * factorialOfNumberUsingRecursion(num-1));
					
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(factorialOfNumberWithLoop(5));
		System.out.println(factorialOfNumberWithLoop(1));
		System.out.println(factorialOfNumberWithLoop(0));
		System.out.println("Factorial of number using Recursive Function :  " +factorialOfNumberUsingRecursion(10));
		System.out.println("Factorial of number using Recursive Function :  " +factorialOfNumberUsingRecursion(1));
		System.out.println("Factorial of number using Recursive Function :  " +factorialOfNumberUsingRecursion(0));
	}

}
