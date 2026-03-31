package JavaPrograms;

import org.testng.annotations.Test;

public class NumberReverse 
{
	@Test
	public void reverseNum()
	{
		int num = 12345;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10+num%10; // 1st iteration - rev * 10 = 0*10 =0 ; num%10 = 12345%10 = 5. so rev = 0*10+12345%10 = 5
			num = num/10; // 1st iteration num = 12345/10 = 5
		}
		System.out.println("Reverse Number is :"+rev);
		
	}

}
