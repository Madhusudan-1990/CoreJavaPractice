package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.testng.annotations.Test;

public class SortValuesDescending 
{
	//Given a list of integers, sort all the values present in it in descending order using Stream functions?
	
	@Test
	public void sortDescending()
	{
		List<Integer> sortDescending = Arrays.asList(10,15,8,49,25,98,98,32,15);
		sortDescending.stream().sorted(Comparator.reverseOrder()).forEach(sys->System.out.println("Given a list of integers, sort all the values present in it in descending order using Stream functions : "+sys));
	}

}
