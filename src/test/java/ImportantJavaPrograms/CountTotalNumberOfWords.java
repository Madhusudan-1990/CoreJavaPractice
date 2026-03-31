package ImportantJavaPrograms;

import java.util.Scanner;

public class CountTotalNumberOfWords {
	public static void main(String[] args) {
		
		String input = "Selenium Automation Testing with Core Java is a good combination";
		int count = 1;
		for (int i = 0; i < input.length() - 1; i++) 
		{
			if ((input.charAt(i) == ' ') && (input.charAt(i + 1) != ' ')) 
			{
				count++;
			}
		}
		System.out.println("Number of words in a string: " + count);
	}
}
