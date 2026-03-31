package ImportantJavaPrograms;

import java.util.HashMap;

public class CountWordOccurance {
	public static void main(String[] args) {
		CharacterCount("Test Automation Java Automation Test");
	}

	static void CharacterCount(String inputString) 
	{
		HashMap<String, Integer> charCountMap = new HashMap<>();
		for (String s : inputString.split(" ")) {
			if (charCountMap.containsKey(s)) {
				charCountMap.put(s, charCountMap.get(s) + 1);
			} else {
				charCountMap.put(s, 1);
			}
		}
		System.out.println("Count of Characters in a given string : " + charCountMap);
	}
}
