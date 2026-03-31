package ImportantJavaPrograms;

import java.util.Scanner;

public class PrintEachCharaterTwice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String doubledString = doubleCharacters(input);
		System.out.println("Doubled characters: " + doubledString);
	}

	public static String doubleCharacters(String str) {
		StringBuilder doubled = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			doubled.append(ch).append(ch); // Append each character twice
		}
		return doubled.toString();
	}
}
