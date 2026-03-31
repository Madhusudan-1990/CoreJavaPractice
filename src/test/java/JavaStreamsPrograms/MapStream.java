package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class MapStream 
{
	@Test
	public void convertUpperCaseUsingMap()
	{
		List<String> vehicles = Arrays.asList("car","biKe","cycle","aeroplane","cruise","train");
		List<String> vehicleNameInUpperCase =  vehicles.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicleNameInUpperCase);
	}
	
	@Test
	public void countLengthAndStoreUsingMap()
	{
		List<String> vehicles = Arrays.asList("car","biKe","cycle","aeroplane","cruise","train");
		List<Integer> vehiclCount =vehicles.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println(vehiclCount);
	}
	
	@Test
	public void multipleEveryDigitWith3AndStoreItInCollection()
	{
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,6);
		List<Integer> numbersMultiplied = numbers.stream().map(num->num*3).collect(Collectors.toList());
		numbersMultiplied.forEach(n->System.out.println("Numbers multiple with 3 :"+n));
	}

}
