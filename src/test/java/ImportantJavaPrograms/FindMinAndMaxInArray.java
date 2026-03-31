package ImportantJavaPrograms;

public class FindMinAndMaxInArray 
{
	public static void main(String [] args)
	{
		int array[]= {9,43,-293,902,3420};
		findSmallestAndLargestNumber(array);
	}
	public static  void findSmallestAndLargestNumber(int array[])
	{
	
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		int min = array[0]; // Starting from 0 index . Initializing smallest with 1st number
		int max = array[0]; // Starting from 0 index . Initializing largest with 1st number
		
		for(int i=1;i<array.length;i++) // Starting the loop from int i = 1 because number[0] is already assigned to smallest and largest. 
		{
			if(array[i]>max) // So if number[i] is 1(index) so value is -82 and it will execute else if block as -82 is lesser than smallest which is number[0] i.e 90
			{
				max = array[i]; 
			}
			else if(array[i]<min)
			{
				min = array[i];
			}
		}
		
		System.out.println("Smallest Number : "+min+ " and Largest Number : "+max);
	}

}
