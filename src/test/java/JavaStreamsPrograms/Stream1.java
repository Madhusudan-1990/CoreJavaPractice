package JavaStreamsPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream1 
{
//	@Test
	public void arrayWithoutStream()
	{
		// Count the names that starts with A
		List<String> names = new ArrayList();
		names.add("AbhishekAchar");
		names.add("Amith");
		names.add("Madhu");
		names.add("Sudi");
		names.add("AjayAchar");
		names.add("Anirudha");
		names.add("GuruPavan");
		int count = 0;
		for(String s : names)
		{
			if(s.startsWith("A"))
			{
				System.out.println(s);
				count++;
			}
		}
		System.out.println("Count :  "+count);
		
	
	}
	@Test
	public void arrayWithStreamCountName()
	{
		
		List<String> names = new ArrayList();
		names.add("AbhishekAchar");
		names.add("Amith");
		names.add("Madhu");
		names.add("Sudi");
		names.add("AjayAchar");
		names.add("Anirudha");
		names.add("GuruPavan");
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println("Name Count that starts with A : "+c);
		
		
		
	}
	@Test
	public void streamFilterwithStreamApi()
	{
		long d = Stream.of("AbhishekAchar","Amith","Madhu","Sudi","AjayAchar","Anirudha","GuruPavan").filter(s->s.startsWith("M")).count();
		System.out.println("Name Count that starts with M : "+d);
		
		//filter the names and print, where name of the length is greater than or equal to 6 characters
		Stream.of("AbhishekAchar","Amith","Madhu","Sudi","AjayAchar","Anirudha","GuruPavan").filter(n->n.length()>=6).forEach(n->System.out.println("filter the names and print, where name of the length is greater than 4 characters : "+n));
		
		//filter only 2 name where where name of the length is greater than 6 characters
		
		Stream.of("AbhishekAchar","Amith","Madhu","Sudi","AjayAchar","Anirudha","GuruPavan").filter(b->b.length()>6).limit(2).forEach(b->System.out.println("filter only 2 name where where name of the length is greater than 6 characters : "+b));
	}
	
	@Test
	public void streamMap()
	{
		//print all the names which has length more than 4 characters and ends with 'r' in Uppercase
		
		Stream.of("AbhishekAchar","Amith","Madhu","Sudi","AjayAchar","Anirudha","GuruPavan").filter(c->c.length()>4).filter(c->c.endsWith("r")).map(c->c.toUpperCase()).forEach(c->System.out.println("print all the names which has length more than 4 characters and ends with 'r' in Uppercase : "+c));
	}
	
	@Test
	public void sortStream()
	{
		// sort all the  names in alphabetical order that starts with letter A and convert it to UpperCase
		List<String> names = Arrays.asList("AbhishekAchar","Amith","Madhu","Sudi","AjayAchar","Anirudha","GuruPavan");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println("sort all the  names in alphabetical order that starts with letter A and convert it to UpperCase : "+s));
	}
	
	@Test
	public void concat2Streams()
	{
		// Concat 2 List in sorted order
		List<String> stream1 = new ArrayList<String>();
		stream1.add("AbhishekAchar");
		stream1.add("Amith");
		stream1.add("Madhu");
		stream1.add("Sudi");
		stream1.add("AjayAchar");
		stream1.add("Anirudha");
		stream1.add("GuruPavan");
		
		List<String> stream2 = Arrays.asList("ABVASD","AASKDKA","KJKASJD","KASJDASD","JDakjasijd");
		Stream<String> stream3= Stream.concat(stream1.stream(), stream2.stream());
		stream3.sorted().forEach(s->System.out.println("Concat 2 List : "+s));
		
		// Sort the concatenated stream in ascending order and return true if the element is present in new stream.
		List<String> list1 = Arrays.asList("AASDLKDA","JAKAJSD","MASDJK","LASDLM","JASDKJANCKK");
		List<String> list2 =  Arrays.asList("KDLAKSD","JASJCIEE","OALLLL","LASOKD","MKASNslkjalkjis","AICJnskj","lkjsadl");
		
		Stream<String> stream4= Stream.concat(list1.stream(), list2.stream());
//		stream4.sorted(); -------> This is commented because , once the stream is modified(here it is sorted) we cannot write on the stream again
		boolean flag = stream4.anyMatch(a->a.equalsIgnoreCase("OALLLL"));
		Assert.assertTrue(flag);
		
		
	}
	
	@Test
	public void streamCollect()
	{
		List<String>ls = Stream.of("ABVASD","AASKDKA","KJKASJD","KASJDASD","JDakjasijd").filter(s->s.endsWith("D")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Using Collectors : "+ls.get(1));
	}
	
	@Test
	public void streamDistinctSort()
	{
		// from the array of integers, print the unique numbers and sort them.
		
		List<Integer> listOfIntegers = Arrays.asList(3,2,5,7,3,9,3,7,2,8,10);
		listOfIntegers.stream().distinct().sorted().forEach(s->System.out.println("from the array of integers, print the unique numbers and sort them : "+s));
	}
	
	@Test
	public void streamFindLargestString()
	{
		// Find the longest string in a list of strings using Java streams:
		
		List<String> fruitList = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
		System.out.println("Find the longest string in a list of strings using Java streams : "+fruitList.stream().max(Comparator.comparingInt(String::length)).map(s->s.toUpperCase()));
	}
	
	@Test
	public void streamFindFrequencyOfEachWord()
	{
	   //	Given a list of strings, find the frequency of each word using Java streams:
		List<String> words  = Arrays.asList("apple", "banana", "apple", "cherry", 
                "banana", "apple");
		System.out.println("Given a list of strings, find the frequency of each word using Java streams: "+words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
	}

}
