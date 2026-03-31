package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {

	public static void main(String[] args) 
	{
		// Write a program to print the count of each character in a String?
		
		String input = "string data to count each character";
		
		Map<String,Long> mapObject = Arrays.stream(input.split("")).map(s->s.toLowerCase())
										.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Write a program to print the count of each character in a String : "+mapObject);
		

	}

}
