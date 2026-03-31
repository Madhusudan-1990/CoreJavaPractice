package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicateElements 
{
	//How to find duplicate elements in a given integers list in java using Stream functions?
	@Test
	public void findDuplicate()
	{
		List<Integer> duplicates = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> sets = new HashSet<Integer>();
		duplicates.stream().filter(n->!sets.add(n))// Filters non unique/duplicate numbers
		.forEach(sys->System.out.println("Duplicate Elements from the list : "+sys));
	}
	
	@Test
	public void findUnique()
	{
		List<Integer> duplicates = Arrays.asList(10,15,8,49,25,98,98,32,15);
		duplicates.stream().distinct().forEach(sys->System.out.println("Unique/Disctinct Element : "+sys));
	}

}
