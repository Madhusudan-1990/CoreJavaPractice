package Strings;

public class WordReverse {
	public static String reverseWord(String str) {
		String revWord = "";
		if (str == null) {
			throw new RuntimeException("Value cannot be null !!!");
		}
		String strArray[] = str.split(" ");
		if (strArray.length == 0) {
			throw new RuntimeException("String Array cannot be 0");
		}

		int strLength = strArray.length;

		for (int i = strLength - 1; i >= 0; i--) {
			revWord = revWord + strArray[i];
		}
		return revWord;
	}

	public static void main(String[] args) {

		System.out.println(reverseWord("Java Python Ruby"));
		System.out.println(reverseWord("Selenium"));
//		System.out.println(reverseWord(" "));
//		System.out.println(reverseWord(null));
		System.out.println(reverseWord("098123 0983409 8768732"));
	}

}
