package JavaCollection;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * HashMap (Java Collection):
 *
 * HashMap stores data in key-value pairs.
 * It does NOT maintain insertion order.
 *
 * ----------------------------------------
 * Internal Working of HashMap:
 * ----------------------------------------
 *
 * - HashMap uses an array of buckets internally.
 *
 * - Default Capacity:
 *   Default size is 16 (index from 0 to 15)
 *
 * - Each bucket (node) stores:
 *     1. HashCode
 *     2. Key
 *     3. Value
 *
 * - HashCode:
 *   - Calculated only based on the key
 *   - Used to decide where to store the data
 *
 * ----------------------------------------
 * How data is stored (put operation):
 * ----------------------------------------
 *
 * put(key, value):
 *
 *   1. HashCode is generated using the key
 *   2. Index is calculated:
 *        index = hashcode % capacity
 *   3. Value is stored at that index
 *
 * Example:
 *   put("Tom", 100)
 *   hashcode("Tom") → 98789
 *   index = 98789 % 16 → 4
 *
 * ----------------------------------------
 * Collision (VERY IMPORTANT):
 * ----------------------------------------
 *
 * - Sometimes different keys produce same index
 *   → This is called Collision
 *
 * Example:
 *   "Tom", "Sunil", "Naveen" → same index = 4
 *
 * - In this case:
 *   - Multiple nodes are stored at same index
 *   - They are connected using a Linked List
 *
 *   Structure:
 *   [Index 4] → Node1 → Node2 → Node3
 *
 * ----------------------------------------
 * get(key) operation:
 * ----------------------------------------
 *
 * get("Tom"):
 *   1. Calculate hashcode
 *   2. Find index
 *   3. Traverse linked list at that index
 *   4. Compare keys using equals()
 *   5. Return matching value
 *
 * ----------------------------------------
 * Performance Issue (Before Java 8):
 * ----------------------------------------
 *
 * - If too many collisions happen:
 *   Linked list becomes long
 *
 * Example:
 *   100 elements in one bucket
 *
 * - Searching becomes slow → O(n)
 *
 * ----------------------------------------
 * Improvement in Java 8:
 * ----------------------------------------
 *
 * - If nodes in one bucket exceed 8:
 *   Linked List → converted to Binary Tree
 *
 * - This improves search time:
 *     From O(n) → O(log n)
 *
 * - Up to 8 nodes → Linked List
 * - More than 8 → Tree (Balanced BST)
 *
 * ----------------------------------------
 * Important Points:
 * ----------------------------------------
 *
 * - put() → inserts key-value pair
 * - get() → retrieves value using key
 * - Keys must be unique (values can duplicate)
 * - HashCode + equals() are very important
 *
 * ----------------------------------------
 * SDET Use Case:
 * ----------------------------------------
 *
 * - Storing API responses
 * - JSON data handling
 * - Key-value test data
 */
class Student
{
	String name;
	int age;
	public  Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}
public class HashMapImplementation {

	public static void main(String[] args) 
	{
		Student st = new Student("Madhu",35);
		Student st1 = new Student("Amith", 34);
		Student st2 = new Student("Sudi", 32);
		Student st3 = new Student("Ani", 30);
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1, st);
		map.put(2, st1);
		
		System.out.println(map.get(1).name); //madhu
		System.out.println(map.get(1).age); //35
		
		System.out.println(map.get(2).name); //Amith
		System.out.println(map.get(2).age); //34
		
		map.put(null, st2); // In Hashmap only 1 null key is allowed. Having one more null will not throw any error. 
		
		System.out.println(map.get(null).name); //Amith
		System.out.println(map.get(null).age); //34
		
		for(Entry<Integer, Student> m : map.entrySet())
		{
			
		}
		
		
		// HashMap internal architecture
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("TOM", 20);
		empMap.put("Veena", 30);
		empMap.put("Sunil", 35);
		empMap.put("Pradesh", 40);
		empMap.put("naveen", 45);
		/*
		 * 
		 */

	}

}
