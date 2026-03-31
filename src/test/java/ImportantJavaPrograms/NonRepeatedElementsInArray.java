package ImportantJavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatedElementsInArray {

    // Function to find non-repeated elements
    public static void findNonRepeatedElements(int[] arr) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array and store the frequency of each element in the HashMap
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print the elements that appear only once (non-repeated elements)
        System.out.println("Non-repeated elements:");
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Sample array
        int[] arr = {4, 5, 6, 7, 4, 8, 9, 5, 9};
        
        // Call the function to find and print non-repeated elements
        findNonRepeatedElements(arr);
    }
}