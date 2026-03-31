/*
 * When to use a for loop:
 * Use a for loop when the number of iterations is fixed or known in advance.
 *
 * Use cases:
 *   - Month dropdown (values from 1 to 12)
 *   - Iterating through arrays and ArrayLists
 *   - Footer links on a webpage
 *   - Dropdowns with fixed data
 *   - Booking scenarios like selecting seats (e.g., 150 seats in a movie or flight)
 *
 * If the increment/decrement condition is missing or incorrect,
 * the loop can result in an infinite loop.
 *
 * Use case of infinite loop:
 *   - LED display boards in hotels or commercial buildings (not recommended in normal coding practices)
 *
 * For loops support iteration over different data types (e.g., int, char, etc.).
 */
public class ForLoopConcept {

	public static void main(String[] args) {

		// Eg1: 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("i : " + i); // 12345678910
		}

		// Eg2: 1 to 10
		for (int d = 1; d <= 10;) {
			System.out.println("d : " + d); // 12345678910
			d++;
		}

		// Eg3: 1 to 10
		int k = 1;
		for (; k <= 10 ;) {
			System.out.println("k : " + k); // 12345678910
			k++;
		}
		
		// Eg 4 : ASCII (interview question)
		
		/*
		 * a=97
		 * b=98
		 * z=122
		 */
		for(char ch = 'a'; ch<='z'; ch++)
		{
			System.out.println(ch +"="+(byte)ch);
		}
		
		// Eg 5(infinite loop) Ugly Code
//		for(;;)
//		{
//			System.out.println("Welcome to Hotel TAJ");
//		}

	}

}
