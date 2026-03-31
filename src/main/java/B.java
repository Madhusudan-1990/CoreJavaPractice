/*
 * Calling main methods between classes:
 *
 * If Class A's main method calls Class B's main method,
 * and Class B's main method calls Class A's main method,
 * it creates a cyclic (recursive) call.
 *
 * This results in a StackOverflowError because:
 *   - Each method call is added to the stack
 *   - The calls keep repeating without termination
 *   - Stack memory gets exhausted
 *
 * To avoid StackOverflowError:
 *   - Do not create cyclic method calls
 *   - Always ensure there is a proper termination condition
 */
public class B {

	public static void main(String[] args) {
		System.out.println("B - main");
		A.main(args);

	}

}
