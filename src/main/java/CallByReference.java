/*
 * Call by Value in Java (Important Concept):
 *
 * Java is always "Call by Value".
 *
 * For primitives:
 *   - The actual value is copied and passed to the method.
 *
 * For objects:
 *   - The reference (address of the object) is copied and passed.
 *   - Both original and copied reference point to the same object.
 *
 * So:
 *   - We CAN modify the object's state inside the method.
 *   - We CANNOT change the original reference.
 *
 * Example:
 *   static void process(Test obj) {
 *       obj.nonStaticMethod(); // accessing instance method
 *       obj.x = 10;            // modifying object state
 *   }
 *
 * Important:
 *   - This is NOT call by reference.
 *   - Only a copy of the reference is passed (still call by value).
 *
 * Calling non-static method from static method:
 *   - Requires creating an object
 *
 *   Example:
 *     Test obj = new Test();
 *     obj.nonStaticMethod();
 *
 * Advantage:
 *   - Allows us to work on the same object without creating a new one.
 *
 * Real-time use case (SDET):
 *   - Page Object Model (POM), where page objects are passed to methods
 *     to perform actions on the same browser instance.
 */
public class CallByReference 
{
	String name;
	int id;
	
	public void m1(int a)
	{
		System.out.println(a);
	}
	
	public static void t1(CallByReference obj) 
	{
		System.out.println("Call By Reference");
		obj.m1(80);
		System.out.println("Name : " +obj.name);
		System.out.println("Id : " +obj.id);
		
		//Overriding 
		obj.name = "Amar";
		obj.id = 23;
		System.out.println("Name : "+obj.name);
		System.out.println("Id : "+obj.id);
	}

	public static void main(String[] args) {
		
		CallByReference obj = new CallByReference();
		obj.m1(20); // Call by Value
		
		obj.name = "Amith";
		obj.id = 12;
		
		CallByReference.t1(obj); // Call by Reference
	}

}
