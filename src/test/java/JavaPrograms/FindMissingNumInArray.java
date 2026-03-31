package JavaPrograms;

import org.testng.annotations.Test;

public class FindMissingNumInArray 
{
	//Logic 
	
	//int a[] = {1,2,4,5} 
   //1+2+4+5 = 12(sum)
   //1+2+3+4+5 = 15(sum1) 
   //15-12 = 3(missing number)	(sum1-sum)
	
	@Test
	public void findMissingNumbInArr()
	{
		int a[] = {1,2,3,4,5,7,8,9,10};
		int sum = 0;
		
		for(int i = 0; i<a.length;i++)
		{
			sum = sum +a[i];
		}
		
		int sum1 = 0;
		for(int j = 1; j<=10;j++) // Here J should be <= Last element of the array
		{
			sum1 = sum1+j;
		}
		
		int missingNum = sum1-sum;
		System.out.println("Missing Number is :"+missingNum);
	}

}
