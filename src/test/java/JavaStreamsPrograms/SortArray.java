package JavaStreamsPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortArray 
{
	//Write a Java 8 program to sort an array and then convert the sorted array into Stream?
	
	@Test
	public void sortArray()
	{
		int arr[] = {99, 55, 203, 99, 4, 91 };
		
		Arrays.parallelSort(arr); // Sorted the Array using parallelSort()
		
		Arrays.stream(arr).forEach(sys->System.out.println("Java 8 program to sort an array and then convert the sorted array into Stream : "+sys));
	}

}
