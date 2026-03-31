/*
 * Loop performance:
 * A traditional for loop provides more control and can be slightly more efficient in some cases,
 * while a foreach loop is more readable and easier to use.
 *
 * Object Array:
 * Object is the superclass of all classes in Java.
 * An Object array (Object[]) can store elements of different data types.
 *
 * Example:
 *   Object[] arr = {"Java", 10, true};
 *
 * In contrast, arrays like String[] or int[] can store only their specific data types.
 *
 * Index concepts:
 *   - Lowest Index (LI) = 0
 *   - Highest Index (HI) = length - 1
 *   - Length = HI + 1
 *
 * Reverse iteration:
 * A for loop is preferred for reverse traversal (from length - 1 to 0),
 * as it provides index control.
 * Foreach loop is not suitable for reverse iteration, even though workarounds exist.
 *
 * Static Array Use Cases:
 *   - Flight ticket seats
 *   - Month dropdown
 *   - Country dropdown
 *
 * Array Literals:
 * Arrays initialized with values at the time of declaration are also static arrays.
 *
 * Example:
 *   int num[] = {10, 20, 30, 40};
 *
 * Using 'new' keyword:
 * Used when the size is known but values are assigned later.
 *
 * Example:
 *   int pop[] = new int[40];
 *
 * Limitation of arrays:
 * Arrays have a fixed size. Assigning a new value to an index replaces the existing value,
 * which can lead to data loss if not handled carefully.
 * Arrays do not support dynamic insertion like ArrayList.
 *
 * Array vs Arrays:
 *   - Array: A core language construct (concept) used to store fixed-size collections.
 *   - Arrays: A utility class (java.util.Arrays) that provides helper methods
 *             like sort(), toString(), binarySearch(), etc.
 */

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) 
	{
		int i [] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i);// This prints Hashcode of memory address ->[I@4517d9a3
		// Foreach Loop
		for(int e : i)
		{
			System.out.println("Array Elements : "+e);
		}
		
		//Eg 2 
		String name[] = new String[4];
		name[0] = "Sudi";
		name[1] = "Madhu";
		name[2] = "Amith";
		name[3] = "Ani";
		
		for(String empName : name)
		{
			System.out.println(empName);
			if(empName.equals("Amith"))
			{
				System.out.println(empName + " Emp is admin");
				break;
			}
		}
		
		//Eg 3 Object Array
		Object data[] = new Object[5]; // Length is 5, Range -> 0-4
		data[0] = "Tom";
		data[1] = 24;
		data[2] = 'm';
		data[3] = 35.50;
		data[4] = true;
		
		System.out.println("Using Arrays To String " +Arrays.toString(data));
		
		for(Object person : data)
		{
			System.out.println(person);
		}
		
		// Eg 4 Print 10,20, 30, 40 in reverse order in an array (for loop)
		int len = i.length;
		System.out.println("Lenght : "+len);
		for(int k = len-1; k>=0; k--)
		{
			System.out.println(i[k]);
		}
		
		// Eg 5 Print 10,20, 30, 40 in reverse order in an array (foreach loop) ( This is not a good approach)
		int count = i.length-1; // 4-1=3
		for(int e : i) // 
		{
			e = count;
			System.out.println(i[e]);//40 30 20 10 // e cannot be used instead of i since e is not an array
			count--;
		}

	}

}
