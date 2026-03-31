package JavaPrograms;

import org.testng.annotations.Test;

public class SmallestAndLargestNumber 
{
	// Time Complexity is O(n) since there's only 1 for loop
	@Test
	public  void findSmallestAndLargestNumber()
	{
		int[] number = {90,-82,93,984,0,-2,93903};
		
		int smallest = number[0]; // Starting from 0 index . Initializing smallest with 1st number
		int largest = number[0]; // Starting from 0 index . Initializing largest with 1st number
		
		for(int i=1;i<number.length;i++) // Starting the loop from int i = 1 because number[0] is already assigned to smallest and largest. 
		{
			if(number[i]>largest) // So if number[i] is 1(index) so value is -82 and it will execute else if block as -82 is lesser than smallest which is number[0] i.e 90
			{
				largest = number[i]; 
			}
			else if(number[i]<smallest)
			{
				smallest = number[i];
			}
		}
		
		System.out.println("Smallest Number : "+smallest+ " and Largest Number : "+largest);
	}

}
