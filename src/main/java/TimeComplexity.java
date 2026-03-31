/*
 * Time Complexity:
 * Time complexity measures how the execution time of code grows as the input size increases.
 * It does not represent actual time (in seconds), but the growth trend of the algorithm.
 *
 * Common Time Complexities:
 *   - O(1)       : Constant time      (e.g., accessing an array element: arr[0])
 *   - O(n)       : Linear time        (e.g., single loop)
 *   - O(n^2)     : Quadratic time     (e.g., nested loops)
 *   - O(log n)   : Logarithmic time   (e.g., binary search)
 *   - O(n log n) : Linearithmic time  (e.g., efficient sorting algorithms)
 *
 * Why Time Complexity matters (SDET perspective):
 *   - Handling large data sets (web tables, API responses, logs)
 *   - Improving performance of test utilities and frameworks
 *   - Avoiding slow test execution, especially in large test suites
 */

public class TimeComplexity {

	public static void main(String[] args) {

		// Eg 1

		int n = 1;

		for (int i = 0; i < n; i++) {
			System.out.println(i);

//		    If n = 10 → runs 10 times
//		    		👉 If n = 1000 → runs 1000 times
//
//		    		✅ Time complexity = O(n) (linear)

		}
		// O(1) — Constant
		int x = 26; // Always one operation

		// O(n) — Linear
		for (int i = 0; i < n; i++) {
			// operation
		}

		// O(n²) — Nested loop
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// operation
			}
		}
		
		//O(log n) — Binary Search
		int left = 0, right = n - 1;
		while (left <= right) {
		    int mid = (left + right) / 2;
		}

	}

}
