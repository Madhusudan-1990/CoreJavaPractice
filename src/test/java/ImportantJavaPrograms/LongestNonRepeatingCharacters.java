package ImportantJavaPrograms;

import java.util.HashSet;

public class LongestNonRepeatingCharacters 
{
	  public static int lengthOfLongestSubstring(String s) {
	        // Create a set to store unique characters
	        HashSet<Character> set = new HashSet<>();
	        
	        // Initialize pointers for the sliding window
	        int left = 0;
	        int maxLength = 0;
	        
	        // Iterate through the string with the right pointer
	        for (int right = 0; right < s.length(); right++) {
	            // If the character is already in the set, move the left pointer
	            while (set.contains(s.charAt(right))) {
	                set.remove(s.charAt(left));
	                left++;
	            }
	            
	            // Add the current character to the set
	            set.add(s.charAt(right));
	            
	            // Update the max length of the substring
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
	        
	        return maxLength;
	    }

	    public static void main(String[] args) {
	        String input = "abcdefgac";
	        int result = lengthOfLongestSubstring(input);
	        System.out.println("Length of the longest substring without repeating characters: " + result);
	    }
}