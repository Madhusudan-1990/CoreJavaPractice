package ImportantJavaPrograms;

public class ShortestLongestString {
    public static void main(String[] args) {
        // Input sentence
        String sentence = "I Love FootBall";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Initialize variables to store the shortest and longest words
        String shortestWord = words[0];
        String longestWord = words[0];

        // Iterate through each word in the array
        for (String word : words) {
            // Update the shortest and longest words based on length
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Print the shortest and longest words
        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Longest word: " + longestWord);
    }
}
