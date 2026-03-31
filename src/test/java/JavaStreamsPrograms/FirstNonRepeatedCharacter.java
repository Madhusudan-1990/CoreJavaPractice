package JavaStreamsPrograms;

import org.testng.annotations.Test;

public class FirstNonRepeatedCharacter 
{
	//Given a String, find the first non-repeated character in it using Stream functions?
	 String input = "Java articles are Awesome";
	 @Test
	 public void findFirstNonRepeated()
	 {
		Character processedInput = input.chars()
				.mapToObj(c->(char)c)
				.filter(ch->input.indexOf(ch)==input.lastIndexOf(ch))
				.findFirst().orElse(null);
		 System.out.println("First Non Repeated Characters : "+processedInput);
		 
	 }

}
