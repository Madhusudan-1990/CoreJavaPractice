/*
 * When to use a while loop:
 * Use a while loop when the number of iterations is not fixed or known in advance.
 *
 * Use cases:
 *   - Calendar handling (e.g., navigating from year 1990 to 2026)
 *   - Infinite scrolling (Facebook, LinkedIn, YouTube)
 *   - Waiting for an element to appear on a page when the exact time is unknown (e.g., 5s, 10s, 15s, etc.)
 *   - Waiting for a page to fully load
 *   - Handling web tables with pagination (e.g., pages 1 to 100) when the exact location of the element is unknown
 */

public class WhileLoopConcept {
	public static void main(String args[]) {

		// Eg 1
		int i = 1;
		while (i <= 10) {
			System.out.println("i :" + i);
			i++;// 12345678910
			// ++i;// 12345678910
			// i=i+1;// 12345678910
		}

		// Eg 2
		int j = 1;
		while (j <= 10) {
			j++;// 1234567891011
			// ++i;// 12345678910
			// i=i+1;// 12345678910
			System.out.println("j :" + j);
		}

		// Eg 3 Break
		int k = 1;
		while (k <= 50) {
			System.out.println("Hi");
			break; // If break is not provided it will go to infinite loop
		}

		// Eg 4 While with If condition
		int p = 1;
		while (p <= 50) {
			System.out.println("p :" + p); // 12345
			if (p == 5) {
				System.out.println("Bye");
				// p++; -> Infinite Loop
				break;
			}
			p++;

		}

		// Eg 5 Print 10 to 1
		int a = 10;
		while (a >= 1) {
			System.out.println("a : " + a); // 10,9,8,7......
			a--;
			// --a;
			// a=a-1;
		}

		// Eg 6 ++j
		int n = 1;
		while (n <= 10) {
			++n; // 234567891011
			System.out.println("n : " + n);

		}

	}

}
