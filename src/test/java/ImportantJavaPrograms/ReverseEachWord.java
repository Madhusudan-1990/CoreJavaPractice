package ImportantJavaPrograms;

public class ReverseEachWord {
	public static void main(String[] args) {
		reverseEachWordOfString("Java is good programming langauges");
	}

	static void reverseEachWordOfString(String inputString) 
	{
		String[] words = inputString.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String res = "";
			char ch;
			for (int j = 0; j < word.length(); j++) {
				ch = word.charAt(j);
				res = ch + res;
			}
			reverseString = reverseString + res + " ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
	}

}
