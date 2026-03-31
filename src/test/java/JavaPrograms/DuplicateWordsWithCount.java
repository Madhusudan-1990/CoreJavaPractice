package JavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsWithCount 
{

	public static void main(String[] args) 
	{	
//		findDuplicateWords("Hey Java is a best language is java");
		findDuplicateWords("Hey Python is a best language is python is a best");

	}
	
	public static void findDuplicateWords(String inputString)
	{
		
		// Splitting based on space. Split method always returns a string array
		String words[] = inputString.split(" ");
		
		//Create a Hash Map
		HashMap<String,Integer> wordCount = new HashMap<String, Integer>();
		
		//To check each word present in the array using foreach loop
		for(String word:words)
		{
			//if already word is present in then increment it count
			if(wordCount.containsKey(word))
			{
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}
			//if word is not present, add it to map with count 1
			else
			{
				wordCount.put(word.toLowerCase(),1);
			}
		}
		
		//Extracting all the keys of Map - WordCount
		Set<String> wordsInString = wordCount.keySet();
		for(String word : wordsInString)
		{
			if(wordCount.get(word)>1)
			{
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
		
	}

}
