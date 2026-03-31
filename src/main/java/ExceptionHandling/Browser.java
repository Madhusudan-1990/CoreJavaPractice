package ExceptionHandling;

/*
 * throws keyword:
 *
 * - 'throws' is used to declare that a method may throw exceptions.
 * - It does not handle the exception; it only propagates it to the caller.
 *
 * - Exception handling is done using try-catch blocks.
 *
 * - 'throws' is mainly used for checked exceptions to inform the caller
 *   that it must handle or further propagate the exception.
 *
 * - It acts as an indication to the developer that an exception might occur.
 *
 * - Using try-catch in the main method is allowed,
 *   but generally avoided unless handling is required at the top level.
 *
 * ---------------------------------------------------------
 * throw keyword:
 *
 * - 'throw' is used to explicitly throw an exception.
 *
 * - It can be used to throw:
 *     - Built-in exceptions
 *     - Custom (user-defined) exceptions
 *
 * - 'throw' is commonly used with custom exceptions
 *   to represent application-specific errors.
 *
 * - 'throw' does not handle the exception; it only triggers it.
 *
 * Example:
 *   throw new RuntimeException("Something went wrong");
 *
 * ---------------------------------------------------------
 * Difference between throw and throws:
 *
 * - throw:
 *     - Used to actually throw an exception
 *     - Used inside a method body
 *     - Throws one exception at a time
 *
 * - throws:
 *     - Used to declare exceptions
 *     - Used in method signature
 *     - Can declare multiple exceptions
 *
 * - Both do not handle exceptions; handling is done using try-catch
 */
public class Browser {
	public void search()  {
		System.out.println("m1 method");
		cart();
	}

	public void cart() throws ArithmeticException {
		System.out.println("m2 method");
		try {
			bankPayment();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("AE coming soon");
		}
	}

	// HDFC Bank Application : 3rd Party Application. ( If exception is not handled
	// here, it has to be handled at cart() method)
	public void bankPayment()  {
		System.out.println("m3 method");
		int i = 9 / 0;
	}

	// Caller Method
	public static void main(String args[]) {
		Browser b = new Browser();
		b.search();
		System.out.println("Bye");
	}
}
