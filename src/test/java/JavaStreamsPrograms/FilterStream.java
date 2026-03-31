package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class FilterStream 
{
	@Test
	public void filterEvenNumbers()
	{
		// filter Even Numbers from 1 list and store it into another list
		List<Integer> list1 = Arrays.asList(10,31,84,29,92,77,922,939,9492,949923,39934,88);
		
		List<Integer>list2 = list1.stream().filter(s->s%2==0).collect(Collectors.toList());
		list2.forEach(s->System.out.println("filter Even Numbers from 1 list and store it into another list :"+s));
		
	}
	
	@Test
	public void filterWithMultiConditions()
	{
		//filter name which has  character greater than 6 and less than 8
		
		List<String> names = Arrays.asList("AAAAAA","BBBBBBBBB","CCCCCCC","DDDDDDDD","EEE","FFFFFFF","IIIIIIII","JJJJs");
		names.stream().filter(n->n.length()>6).filter(n->n.length()<8).forEach(n->System.out.println("filter name which has  character greater than 6 and less than 8 :"+n));
	}
	
	@Test
	public void filternullAndCollectRestofValues()
	{
		//filter null and add rest of the values to collection.
		
		List<String> food = Arrays.asList("Panner",null,"Palak","Lemon","Salt",null,"Chilli",null,"Garlic");
		List<String>listWithoutNull = food.stream().filter(r->r!=null).collect(Collectors.toList());
		listWithoutNull.forEach(s->System.out.println("filter null and add rest of the values to collection :"+s));
	}

}
