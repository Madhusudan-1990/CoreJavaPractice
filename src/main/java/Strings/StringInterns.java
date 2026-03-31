package Strings;

/*
 * intern():
 * The intern() method returns a reference to the string from the String Constant Pool (SCP).
 *
 * If the string already exists in SCP, it returns the existing reference.
 * Otherwise, it adds the string to SCP and returns its reference.
 *
 * When a string is created using "new", two objects are created:
 * 1. One in Heap memory
 * 2. One in String Constant Pool (if not already present)
 *
 * Example:
 * String s = new String("hello java"); // Heap + SCP
 * String s1 = s.intern();              // Points to SCP
 *
 * Here:
 * s  -> Heap object
 * s1 -> SCP object
 *
 * Hence:
 * s == s1 → false (different references)
 *
 * Purpose of intern():
 * To get the canonical (shared) reference from SCP.
 * Usually this is used for better memory optimization in case of legacy code.
 *
 * Best Practice:
 * Prefer string literals ("hello") over new String() to save memory and reuse SCP.
 */
public class StringInterns {

	public static void main(String[] args) 
	{
		String s = new String("hello java"); // 2 Entries --> One in heap and other in SCP
		
		String s1 = s.intern(); 
		
		System.out.println(s1);// hello java
		
		System.out.println(s);
		
		System.out.println(s==s1); // false
		
		System.out.println(s.equals(s1));//trues

	}

}
