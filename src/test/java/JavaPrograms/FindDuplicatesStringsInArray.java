package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicatesStringsInArray 
{
	//Approach 1 : Using for loop - O(n2) Worst Case Time Complexity
	@Test
	public void findDuplicateString()
	{
		String[] input = {"Java", "Python", "C", "C#", "C++", "Go", "C", "C", "Java", "Java"};
		
		
		for(int i =0;i<input.length;i++) // here i = Java in 1st iteration, i = Python in 2nd iteration
		{
			for(int j =i+1;j<input.length;j++) // here j = Python . so Java is compared with python, ruby, scala, java. Next i = Python in 2nd iteration and compared with Ruby, Scala, Java and so on for the next elements. Hence this is worst time complexity o(n2)		
			{
				if(input[i].equals(input[j]))
				{
					System.out.println("Duplicate Element using inner for loop : " +input[i]);
				}
			}
		}
	}
	
	//Approach 2 : Using Hash Set which stores only unique values. Time Complexity is O(n) which is good complexity
	@Test
	public void findDuplicateStringUsingHashSet()
	{
		String[] input = {"Java", "Python", "C", "C#", "C++", "Go", "C", "C", "Java", "Java"};
		
		Set<String> set = new HashSet<String>();
		for(String course : input) // when for each loop executes, it checks if Java , Python, Ruby, Scala is present.
		{
			if(set.add(course)==false) // If not it will add using .add() which adds if the element is not present. When .add condition is false(meaning it element is already present) eg : Java , C , it will filter.
			{
				System.out.println("Duplicate Element using HashSet : "+course);
			}
		}
	}
	
	//Approach 3 : Using Hash Map Time Complexity is O(2n) which is a very good complexity
	@Test
	public void findDuplicateStringUsingHashMap()
	{
		String[] input = {"Java", "Python", "C", "C#", "C++", "Go", "C", "C", "Java", "Java"};
		
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		
		for(String name : input)
		{
			Integer count = storeMap.get(name); // Here .get() method  gets the count of the map where it will be null initially
			if(count == null)
			{
				storeMap.put(name, 1); // This will add only unique elements(count is null for each element). In this example count of Java will be 1 initially and 1 for other inputs Python, Ruby, Scala
			}
			else
			{
				storeMap.put(name, ++count); // This will add only if duplicate elements is present and increases the count. In this example count of Java will Java  2 ====> name = Java, count = 2
			}
		}
		
		// Now get the values from Map and store in entry set. entrySet() method stores key value pair
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String,Integer> entry : entrySet) // Iterating the entry set(key value pairs)
		{
			if(entry.getValue()>1) // entry.getValue gets the int value for that key. Here Java is the key and its value is 2 which is greater than 1
			{
				System.out.println("Duplicate Element using Hash Map : " +entry.getKey() + " Occurances : "+entry.getValue());
			}
		}
	}
	
	
}
