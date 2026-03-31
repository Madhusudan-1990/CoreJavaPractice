package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StreamDistinctCountLimitMinMaxReduce 
{
	// Intermediate Operations : Distinct, Limit, Min, Max
	// Terminal Operations : Count, Reduce

	@Test
	public void distinctCountLimit()
	{
		// (Distinct) Intermediate Operations : Removes duplicate elements from the stream.
		
		List<String> vehicles = Arrays.asList("Car","Bus","Train","Car","Bus","Aeroplane","Cruise","Helicoptor","Aeroplane");
		// Here the  elements are stored in a list after filtering unique elements using distinct function
		List<String> disctinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
		disctinctVehicles.forEach(d->System.out.println("Distinct Vehicles are : "+d));
		
		// Count(Terminal Operation) : Returns the count of elements in the stream.
		
		//Fetch the count of distinct elements. 
		long countOfDistinct = vehicles.stream().distinct().count();
		System.out.println("Count of unique elements : "+countOfDistinct);
		
		//Limit(Intermediate Operations) : Truncates the stream to be no longer than the specified size.
		
		//Limit vehicle to 3
		List<String>vehicleList= vehicles.stream().limit(3).collect(Collectors.toList());
		System.out.println("3 Vehicles : "+vehicleList);
		
		// Limit vehicles to 4 and just print them
		vehicles.stream().limit(3).forEach(sys->System.out.println(sys));
	}
	
	@Test
	public void countEvenNumbers()
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// Count the even numbers present in array
		long countEvenNos = list.stream().filter(n->n%2==0).count();
		System.out.println("Number of even numbers : "+countEvenNos);
		
	}
	@Test
	public void minStream()
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//Find the min number from the array
		Optional <Integer> mininmum=list.stream().min((val1,val2)->
		{
			return val1.compareTo(val2);
			
		});
		System.out.println("Find the min number from the array : "+mininmum.get());
	}
	
	@Test
	public void maxStream()
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//Find the max number from the array
		Optional<Integer> maximum =	list.stream().max((val1,val2)->
		{
			return val1.compareTo(val2);
		});
		System.out.println("Find the max number from the array : "+maximum.get());
		
	}
	
	@Test
	public void reduceStream()
	{
		//Reduce :  Reduces the elements of the stream to a single value using an associative accumulation function.
		List<String> reduceList = Arrays.asList("1","Car","A","2","Cab","3","4","Cruise");
		
		Optional<String> reduce = reduceList.stream().reduce((val,combinedVal)->
		{
			return combinedVal+val;
		});
		System.out.println("Elements Reduced or Combined from a list : "+reduce);
	}
	

}
