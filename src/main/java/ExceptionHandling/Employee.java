package ExceptionHandling;

/*
 * Exception in Java:
 *
 * - An Exception is an event (object) that disrupts the normal flow of a program.
 *   It is represented as a class in Java.
 *
 * - It is generally better to use multiple specific catch blocks
 *   instead of a single generic (parent) Exception catch block,
 *   as it provides better clarity and debugging visibility.
 *
 * - If unsure about possible exceptions:
 *   - Run the code
 *   - Observe exceptions
 *   - Then handle specific exceptions appropriately
 *
 * - Exception vs Error:
 *   - Exceptions can be handled
 *   - Errors (e.g., OutOfMemoryError) cannot be handled effectively and are generally not meant to be caught
 *
 * - Multiple catch blocks:
 *   - Only one catch block is executed for a given exception
 *   - The first matching catch block in sequence will be executed
 *
 * - Catch block order:
 *   - Always place specific exceptions first and generic ones later
 *   - Otherwise, it leads to compile-time error (unreachable code)
 *   
 *   
 */
public class Employee {

	String name;
	public static void main(String[] args) {
	
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		try
		{
			Employee e = new Employee();
			e = null;
			e.name = "Naveen"; //NPE
			
			int i = 9/0; //AE
			System.out.println("D"); // this will not be printed due to exception at line 13
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("AE is Coming");
//			e.printStackTrace();
//		}
//		catch (NullPointerException e) 
//		{
//			System.out.println("NE is Coming");
//			e.printStackTrace();
//		}
		catch(Exception e)
		{
			System.out.println("Exception is Coming");
			e.printStackTrace();
		}
		System.out.println("Bye!");

	}

}
