package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FindOutNumbersStartingWith1 
{
	//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	
	@Test
	public void numberswith1()
	{
		List<Integer> nos = Arrays.asList(10,15,8,49,25,98,32);
		nos.stream().map(n->n+"")// Convert integer to String
		.filter(n->n.startsWith("1")).forEach(n->System.out.println("Numbers that starts with 1 : "+n));
	}

}
