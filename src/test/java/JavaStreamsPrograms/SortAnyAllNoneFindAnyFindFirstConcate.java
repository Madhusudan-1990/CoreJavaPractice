package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class SortAnyAllNoneFindAnyFindFirstConcate 
{
	// Intermediate Function : sorted, 
	// Terminal Function : anymatch, allmatch, nonmatch, findany, findfirst
	
	@Test
	public void sortStream()
	{
		// Sort numbers in ascending order collected in list and print
		List<Integer> sortList = Arrays.asList(1,4,3,8,5,9,2);
		sortList.stream().sorted().collect(Collectors.toList()).forEach(sys->System.out.println("Sort numbers in ascending order : "+sys));
		
		// Sort numbers in descending order and print
		List<Integer> reverseSortList = Arrays.asList(1,4,3,8,5,9,2);
		reverseSortList.stream().sorted(Comparator.reverseOrder()).forEach(sys->System.out.println("Sort numbers in descending order : "+sys));
		
		// Sort string in ascending order and print
		List<String> sortAscList = Arrays.asList("AMD","MPD","PMD","XAS","CCD");
		sortAscList.stream().sorted().forEach(sys->System.out.println("Sort string in ascending order : "+sys));
		
		// Sort string in descending order collected in list and print
		List<String> sortDescList = Arrays.asList("AMD","MPD","PMD","XAS","CCD");
		sortDescList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(sys->System.out.println("Sort string in descending order : "+sys));
	}
	
	@Test
	public void anyAllMatch()
	{
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("One Apple");
		fruits.add("One Mango");
		fruits.add("Two Apple");
		fruits.add("One Orange");
		fruits.add("One Papaya");
		
		//AnyMatch : It returns true if one of the element matches the specified element in the list
		boolean flag = fruits.stream().anyMatch(fruit->fruit.startsWith("One"));
		System.out.println("Any Match : "+flag);//true
		
		//AllMatch : It returns true if all the element matches the specified element in the list
		flag = fruits.stream().allMatch(fruit->{return fruit.endsWith("One");});
		System.out.println("All Match : "+flag);//false
		
		//NoneMatch : It returns true if none of the element matches the specified element in the list
		flag = fruits.stream().noneMatch(fruit->{return fruit.contains("WaterMelon");});
		System.out.println("None Match : "+flag);//true
		
	}
	@Test
	public void findAnyFindFirst()
	{
		List<String> any = Arrays.asList("five","one","three","four","two");
		
		//Find Any Element. If no element present it will throw NoSuchElement Exception
		Optional<String> opt = any.stream().findAny();
		System.out.println("Find Any Element : "+opt.get());
		
		//Find First Element. If no element present it will throw NoSuchElement Exception
		opt = any.stream().findFirst();
		System.out.println("Find First Element : "+opt.get());
		
	}
	
	@Test
	public void concat()
	{
		List<String> animals = Arrays.asList("Elephant","Tiger","Camel","Hippo");
		List<String> birds = Arrays.asList("Macaw","Sparrow","Peacock","Parrot");
		
		Stream<String> an = animals.stream();
		Stream<String> bd = birds.stream();
		
		List<String> finalList = Stream.concat(an, bd).collect(Collectors.toList());
		System.out.println("Final List of Animals and Birds Concatenated : "+finalList);
	}

}
