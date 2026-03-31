package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class PerformCubeAndFilterGreaterThan50 
{
	// Java 8 program to perform cube on list elements and filter numbers greater than 50.
	
	@Test
	public void performCubingAndFilterGreaterThan50()
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		numbers.stream().map(i->i*i*i).filter(i->i>50).forEach(sys->System.out.println("Perform cube on list elements and filter numbers greater than 50 :  "+sys));
	}

}
