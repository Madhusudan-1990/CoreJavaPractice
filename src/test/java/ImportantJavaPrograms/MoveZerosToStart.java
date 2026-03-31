package ImportantJavaPrograms;

public class MoveZerosToStart {

    // Function to move all zeros to the front of the string
    public static String moveZerosToFront(String input) {
        StringBuilder nonZeros = new StringBuilder();  // To store non-zero characters
        int zeroCount = 0;  // To count the number of zeros

        // Traverse the string
        for (char ch : input.toCharArray()) {
            if (ch == '0') {
                zeroCount++;  // Increment the zero count
            } else {
                nonZeros.append(ch);  // Append non-zero characters to the string
            }
        }

        // Prepend the zeros to the beginning
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < zeroCount; i++) {
            result.append('0');  // Append a zero for each zero counted
        }

        // Append the non-zero characters
        result.append(nonZeros);

        return result.toString();  // Return the final string
    }

    public static void main(String[] args) {
        String input = "302400121200";  // Example input string

        System.out.println("Original String: " + input);

        // Call the function to move zeros to the front
        String result = moveZerosToFront(input);

        System.out.println("Output String: " + result);  // Print the result
    }
}
