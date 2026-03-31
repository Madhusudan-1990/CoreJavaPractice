package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class SortValues 
{

	//Given a list of integers, sort all the values present in it using Stream functions?
	@Test
	public void sortValues()
	{
		List<Integer> sort = Arrays.asList(10,15,8,49,25,98,98,32,15);
		sort.stream().sorted().forEach(sys->System.out.println("Given a list of integers, sort all the values present in it using Stream functions : "+sys));
	}

}
