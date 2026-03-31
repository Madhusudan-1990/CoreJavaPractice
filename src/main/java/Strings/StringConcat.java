package Strings;

/*
 * String Immutability:
 *
 * - Strings in Java are immutable (cannot be changed once created)
 *
 * Example:
 * String t1 = "hello";
 *
 * t1.concat("automation");
 *
 * - concat() creates a NEW string object
 * - It does NOT modify the original string
 *
 * System.out.println(t1);
 * // Output: hello (original string unchanged)
 *
 * ---------------------------------------------------------
 * Assigning the result:
 *
 * t1 = t1.concat("automation");
 *
 * - Now t1 refers to the NEW object "helloautomation"
 * - The old "hello" still exists in memory (SCP)
 *
 * System.out.println(t1);
 * // Output: helloautomation
 *
 * ---------------------------------------------------------
 * Memory behavior:
 *
 * String t1 = "hello";                → stored in SCP
 * t1.concat("automation");           → creates a new object "helloautomation" in heap
 *
 * t1 = t1.concat("automation");      → reference updated to new object
 *
 * ---------------------------------------------------------
 * Reusing SCP:
 *
 * String t2 = "helloautomation";
 *
 * - If "helloautomation" already exists in SCP, no new object is created
 * - t2 refers to existing SCP object
 *
 * ---------------------------------------------------------
 * Comparison:
 *
 * System.out.println(t1.equals(t2));
 * // true → compares content
 *
 * System.out.println(t1 == t2);
 * // false → compares references
 *
 * Reason:
 * - t1 refers to a heap object created by concat()
 * - t2 refers to a String literal in SCP
 * - Different memory locations → different references
 *
 * ---------------------------------------------------------
 * Other String Methods:
 *
 * - Methods like trim(), replace(), toUpperCase(), toLowerCase()
 *   DO NOT modify the original string
 *
 * - They return a NEW String object if any change happens
 *
 * Example:
 * String s = " hello ";
 * s.trim();
 * System.out.println(s); // " hello " (unchanged)
 *
 * s = s.trim();
 * System.out.println(s); // "hello"
 *
 * ---------------------------------------------------------
 * Important Note:
 *
 * - If the operation does NOT change content,
 *   JVM may return the same reference (optimization)
 *
 * Example:
 * String s = "hello";
 * s = s.toLowerCase(); // no change → same reference may be returned
 * There's no direct method to reverse a string. Reason is String is immutable.
 */
public class StringConcat {

	public static void main(String[] args) 
	{
		String t1 = "hello";
		t1.concat("automation"); // here t1 will be pointing to hello even though concatenated.
		System.out.println(t1); // only hello not helloautomation because  String class is immutable. 2 entries. One is hello and another one is helloautomation
		t1 = t1.concat("automation"); // this will break connection with hello and point to concatenated value helloautomation stored in SCPs and will create a new object
		System.out.println(t1); //helloautomation
		
		String t2 = "helloautomation"; // 0 entry because already in the string constant pool helloautomation would be stored and reference variable t2 will be pointed to helloautomation in constant pool.
		System.out.println(t1.equals(t2)); //true
		System.out.println(t1 == t2); // false
		// because t1 refers to a heap object created by concat(),
		// while t2 refers to a String literal in the String Constant Pool (SCP)

	}

}
