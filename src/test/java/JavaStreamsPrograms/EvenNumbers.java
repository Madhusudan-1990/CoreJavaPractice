package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class EvenNumbers 
{
	//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
	@Test
	public void findEvenNumbers()
	{
		List<Integer> nums = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> ls = nums.stream().filter(no->no%2==0).collect(Collectors.toList());
		System.out.println("Even numbers filter from the list and collected to list : "+ls);
		
		//Or Print directly without storing to Array
		nums.stream().filter(no->no%2==0).forEach(no->System.out.println("Even numbers filter from the list and printed : "+no));
		
		
	}

}
