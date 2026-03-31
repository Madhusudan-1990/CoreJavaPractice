package JavaPrograms;

import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class Print1to100WithoutAnyLoops {

	/*
	 * Print numbers from 1 to 100 without using any loops.
	 * 1. Through Recursive Function
	 * 2. Through Java Streams
	 */
	
	// 1. Recursive  Functions
	@Test
	public void printNumUsingRecursive()
	{
		printNum(1,100);
	}
	
	// 2 . Java Streams
	@Test
	public void printNumUsingJavaStreams()
	{
		IntStream.range(1, 101).forEach(num->System.out.println(num));
	}
	private static void printNum(int num,int endNum)
	{
		if(num<=endNum)
		{
			System.out.println(num);
			num++;
			printNum(num,endNum); // Recursive Function
		}
	}

}
