package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ReturnTrueIfAnyElementPresentTwice 
{
	//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	
	@Test
	public void findUniqueOrMultiple()
	{
		//Returns true if there are duplicate elements
		List<Integer> nos = Arrays.asList(1,2,3,4,1,5,6,7,9);
		Set<Integer> set = new HashSet<Integer>();
		boolean flag = nos.stream().anyMatch(n->!set.add(n));
		System.out.println("Flag for Duplicates : "+flag);
		
		//Returns false if there are no duplicate elements
		List<Integer> num = Arrays.asList(1,2,3,4,6,5,8,7,9);
		
		Set<Integer> sets = new HashSet<Integer>();
		boolean flag1 = num.stream().anyMatch(nums->!sets.add(nums));
		System.out.println("Flag for Unique : "+flag1);
	}

}
