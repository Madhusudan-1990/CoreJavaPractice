package ImportantJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void isArmstrongNumber(int num)
	{
		System.out.println("Given Number is  " +num);
		int cube = 0;
		int remainder;
		int temp;
		temp = num;
		
		while(num>0)
		{
			remainder = num%10;
			num = num/10;
			cube = cube+(remainder*remainder*remainder);
			
			
		}
		if(temp==cube)
		{
			System.out.println("Given Number is an Amstrong");
		}
		else
		{
			System.out.println("Given Number is not an Amstrong");
		}
	}
	public static void main(String[] args) 
	{
		
		isArmstrongNumber(153);
	}
}