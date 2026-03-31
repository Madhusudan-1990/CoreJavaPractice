package ImportantJavaPrograms;

public class MoveZerosToEnd {

	// Function to move all zeros to the end of the string
	public static String moveZerosToEnd(String input) {
		StringBuilder nonZeros = new StringBuilder(); // To store non-zero characters
		int zeroCount = 0; // To count the number of zeros
		for (char ch : input.toCharArray()) // Traverse the string
		{
			if (ch == '0') 
			{
				zeroCount++; // Increment the zero count
			} 
			else 
			{
				nonZeros.append(ch); // Append non-zero characters to the string
			}
		}
		// Append the zeros to the end
		for (int i = 0; i < zeroCount; i++) 
		{
			nonZeros.append('0'); // Append a zero for each zero counted
		}
		return nonZeros.toString(); // Return the final string
	}

	public static void main(String[] args) {
		String input = "32400121200"; // Example input string

		System.out.println("Original String: " + input);

		// Call the function to move zeros to the end
		String result = moveZerosToEnd(input);

		System.out.println("Output String: " + result); // Print the result
	}
}
