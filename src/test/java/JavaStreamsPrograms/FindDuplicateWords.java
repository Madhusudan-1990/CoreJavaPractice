package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

import com.google.common.base.Functions;

public class FindDuplicateWords {

   @Test
   public void findDuplicateWord()
    {
 
    	//Find Duplicate Words using Stream
    	
    	  String input = "Testing is Testing QS QS";          
          List<String> wordsList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
          Set<String> tempSet = new HashSet<>();
          List<String> duplicateWords = wordsList.stream()
              .filter(w -> !tempSet.add(w))
              .collect(Collectors.toList());
          System.out.println("Find Duplicate Words using Stream "+duplicateWords);
      
    }
   
   @Test
   public void findDuplicateWordsWithOccurance()
   {
	   //How to find only duplicate elements with its count from the String ArrayList in Java8?
	   
	   List<String> names = Arrays.asList("AA","BB","CC","BB","BB");
	   Map<String,Long> namesCount = names.stream().collect(Collectors.groupingBy(Functions.identity(),Collectors.counting()))
			   .entrySet()
			   .stream()
			   .filter(entry->entry.getValue()>1)
			   .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	   System.out.println("How to find only duplicate elements with its count from the String ArrayList in Java8 : "+namesCount);
   }
   
   @Test
   public void findFirstRepeatingWord()
   {
	   // Find first repeating word
	   
	   String input = "Testing is QA Activity QA is QA Role";
	   List<String> wordsList = Arrays.stream(input.split(" ")).collect(Collectors.toList()); // Convert String to Array
	   Set<String> tempSet = new HashSet<String>();
	   List<String> duplicateWords = wordsList.stream().filter(w->!tempSet.add(w)).collect(Collectors.toList()); // Filters duplicate words and store it in List
	   Optional<String> firstDuplicateWord = duplicateWords.stream().findFirst(); //Finds the first duplicate or repeated element.
	   System.out.println("Find first repeating word : "+firstDuplicateWord.get());
   }
}
