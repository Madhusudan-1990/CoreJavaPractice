package ImportantJavaPrograms;

import java.util.Scanner;

public class NumberOfDigits {

    // Function to count the number of digits in a number
    public static int countDigits(int number) {
        // If the number is 0, it has 1 digit
        if (number == 0) {
            return 1;
        }

        int count = 0;

        // Loop to count the digits
        while (number != 0) {
            number = number / 10; // Remove the last digit
            count++; // Increment the count
        }

        return count;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the countDigits method to find the number of digits
        int numDigits = countDigits(number);

        // Print the number of digits
        System.out.println("Number of digits: " + numDigits);
        
        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
