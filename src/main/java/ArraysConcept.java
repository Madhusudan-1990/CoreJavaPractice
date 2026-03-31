/*
 * Array:
 * An array is a collection that stores elements of the same data type.
 *
 * Types of arrays:
 *   - Static Array:
 *       Size is fixed once declared.
 *   - Dynamic Array:
 *       Size can grow or shrink dynamically.
 *       Example: ArrayList
 *
 * Arrays can be created using the 'new' keyword.
 *
 * Arrays.toString():
 *   - Used to print all elements of an array without using a loop.
 *   - It is a static utility method from the Arrays class.
 *   - It is different from the instance-level toString() method.
 *
 * Length in arrays:
 *   - 'length' is a variable (property), not a method.
 *   - Example: arr.length (not arr.length())
 *   Li(LowestIndex) = 0
 *   Length = Hi+1
 *   Hi(HighestIndex) = Length-1
 */
import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		int i[] = new int[4];

		System.out.println(i[0]); // 0
		System.out.println(i[3]); // 0
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]); // 10
		System.out.println(i[3]); // 40
//		System.out.println(i[-1]); //AIOB(Array Index Out of Bound Exception)
//		System.out.println(i[4]); //AIOB

		int len = i.length;
		int highestIndex = len + 1;
		System.out.println("Lowest Index : " + i[0]);
		System.out.println("Length : " + len);
		System.out.println("Highest Index :" + highestIndex);
		for (int j = 0; j < len; j++) {
			System.out.println(i[j]);
		}

		// Arrays.toString() -> It prints all the array elements without use of loop

		System.out.println("Using Arrays toString() : " + Arrays.toString(i));
		
		//
		int p[] = new int[3];//Size(Length) - range(0-2)
		
		//p[3] = 50; // AIOB will be given here itself
		System.out.println(p[0]);//0
		System.out.println(p[1]);//0
		//System.out.println(p[3]);//AIOB

	}

}
