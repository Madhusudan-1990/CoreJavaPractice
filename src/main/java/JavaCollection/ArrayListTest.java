package JavaCollection;

import java.util.ArrayList;
/*
 * ArrayList (Java Collection):
 *
 * ArrayList is a resizable (dynamic) array that stores elements in insertion order.
 *
 * Key Characteristics:
 * - Maintains insertion order
 * - Allows duplicate elements
 * - Index-based access (like arrays)
 * - Dynamic size (grows automatically)
 *
 * Internal Working of ArrayList:
 *
 * - Internally, ArrayList uses a dynamic array.
 *
 * - Default Capacity:
 *   When an ArrayList is created, the initial capacity is 10 (in most implementations).
 *
 * - Adding Elements:
 *   Elements are stored sequentially starting from index 0.
 *
 *   Example:
 *   Index:   0 1 2 3 4 5 6 7 8 9
 *            -------------------
 *            Filled up to capacity 10
 *
 * - Resizing (IMPORTANT):
 *   When the array becomes full and we try to add another element:
 *
 *   1. A new array is created
 *   2. New capacity = old capacity + (old capacity / 2)
 *      → Example: 10 → 15 → 22 → 33 ...
 *   3. Old elements are copied to the new array
 *
 * - This process is called dynamic resizing.
 *
 * Important Clarifications:
 *
 * - ArrayList does NOT use:
 *     ❌ Load Factor (this is used in HashMap)
 *     ❌ Virtual Capacity concept
 *     ❌ Segments
 *
 * - Correct Terms:
 *     ✔ Capacity (size of internal array)
 *     ✔ Size (number of elements actually stored)
 *
 * Example:
 *   ArrayList<Integer> list = new ArrayList<>();
 *
 *   list.add(1); // size = 1
 *   list.add(2); // size = 2
 *
 * Advantage:
 * - Fast random access (O(1))
 * - Dynamic resizing (no fixed size like arrays)
 *
 * Disadvantage:
 * - Resizing is costly (array copy operation)
 * - Insertion/deletion in middle is slow (shifting required)
 *
 * SDET Relevance:
 * - Widely used to store:
 *     - Web elements (List<WebElement>)
 *     - API responses
 *     - Test data collections
 */

public class ArrayListTest {

	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();//vc=10,pc=0
		System.out.println(ar.size());//pc = 0
		
		ar.add(23);//index(i) = 0
		ar.add(32);//i=1
		
		System.out.println(ar.size());//vc=8,pc=2
		
		ar.add(100);//i=2
		ar.add(200);//i=3
		ar.add(200);//i=4
		ar.add(300);//i=5
		
		System.out.println(ar.size());//vc=6,pc4
		
		ar.remove(2); // this will remove entire 2nd index and 3rd index will be moved to 2nd index and size will be 3
	    System.out.println(ar.size()); // size = 3
	    
	    ar.get(1); // gets the value of the 1st Index
	    
	    //print all the values of arraylist
	    System.out.println(ar);
	    
	    //for loop
	    for(int i =0;i<ar.size();i++)
	    {
	    	System.out.println("Using For Loop " + ar.get(i));
	    }
	    
	    //foreach loop
	    for(Object j : ar)
	    {
	    	System.out.println(" Using For Each Loop : " +  j);
	    }
	}

}
