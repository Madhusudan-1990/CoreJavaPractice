package JavaStreamsPrograms;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class FindFirstRepeatedCharacter 
{
	//Given a String, find the first repeated character in it using Stream functions?
	
	String input = "Java Articles are Awesome";
	@Test
	public void findRepeatedCharacter()
	{
		Set<Character> seenCharacters = new HashSet<Character>();
		
		Character processedInput = input.chars()
				.mapToObj(c->(char) c)
				.filter(c->!seenCharacters.add(c))
				.findFirst().orElse(null);
		System.out.println("Given a String, find the first repeated character in it using Stream functions : "+processedInput);
		
		
	}

}
