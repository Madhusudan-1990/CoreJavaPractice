package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMap 
{
	public static void main(String[] args)
	{
		// Maps --> Maps process single element at a time. Maps return single value.
		
		// Add sum 
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = list1.stream().map(l1->l1+10).collect(Collectors.toList());
		list2.forEach(l1->System.out.println("numbers + 10 using Map :"+l1));
		
		// FlatMaps - > Flat Maps process multiple elements(stream of elements). Flat Maps return stream of values.
		
		List<Integer> list3 = Arrays.asList(1,2);
		List<Integer> list4 = Arrays.asList(3,4);
		List<Integer> list5 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(list3,list4,list5);
		
	    List<Integer>sumFinalList =	finalList.stream().flatMap(fL->fL.stream()).map(allList->allList+10).collect(Collectors.toList());
	    sumFinalList.forEach(sum->System.out.println("numbers + 10 using Flat Map : "+sum));
	}

}
