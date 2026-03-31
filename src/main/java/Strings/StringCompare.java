package Strings;

/*
 * == vs equals():
 *
 * - '==' compares references (memory addresses)
 * - '.equals()' compares content (actual value of string)
 *
 * Example:
 * String s1 = "Hello Selenium";
 * String s2 = new String("Hello Selenium");
 *
 * System.out.println(s1 == s2);      // false (different references)
 * System.out.println(s1.equals(s2)); // true  (same content)
 *
 * ---------------------------------------------------------
 * String Constant Pool (SCP):
 *
 * - String literals are stored in SCP (inside heap memory)
 * - SCP avoids duplicate objects for memory optimization
 *
 * Example:
 * String s1 = "Hello Selenium";
 * String s3 = "Hello Selenium";
 *
 * System.out.println(s1 == s3); // true (same reference from SCP)
 *
 * ---------------------------------------------------------
 * Case Sensitivity:
 *
 * String s1 = "Hello Selenium";
 * String s4 = "hello Selenium";
 *
 * System.out.println(s1 == s4); // false (different content → new entry in SCP)
 *
 * ---------------------------------------------------------
 * String creation using 'new':
 *
 * String str = new String("testing");
 *
 * - Creates TWO objects:
 *   1. One in heap (object)
 *   2. One in SCP (if not already present)
 *
 * String str2 = "testing";
 *
 * - No new object created in SCP if already exists
 * - str2 will point to existing SCP object
 *
 * ---------------------------------------------------------
 * Best Practice:
 *
 * - Prefer string literals over 'new' keyword
 * - Because SCP reuses memory → better performance
 *
 * ---------------------------------------------------------
 * Important Clarification:
 *
 * - Strings are immutable (cannot be changed once created)
 * - Any modification creates a new object
 */
public class StringCompare {

	public static void main(String[] args) 
	{
		//String literals
		String s1 = "hello selenium";
		
		//Using new keyword 
		String s2 = new String("hello selenium");
		
		System.out.println(s1==s2); //false 
		System.out.println(s1.equals(s2));//true
		
		String s3 = "hello selenium";
		System.out.println(s1==s3);//true Because s1 and s3 will be pointed to same String "Hello Selenium" stored in String Constant Pool
		
		System.out.println(s2==s3);//false
		
		System.out.println(s1.equals(s3));//true
		
		String s4 = "hello Selenium";
		System.out.println(s1==s4);//false Because it will create a new entry as its case  sensitive.
		
		String str = new String("testing"); // This will create 2 entries/values in the memory. One as an object and other in String Constant Pool
		String str2 = "testing"; //0 entry  v because str2 will be pointing to testing in SCP
		
		String str3 = "Testing"; // This will create 2 entries/values in the memory. One as an object and other in String Constant Pool as String is case sensitive
	}

}
