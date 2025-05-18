/*Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/

// Package declaration (depends on your project structure)
package program1;

public class program3_c10 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the countWords method with a sample sentence and print the word count
        System.out.println("Word count: " + countWords("Java is amazing and powerful"));
    }

    // User-defined method to count the number of words in a given string
    private static int countWords(String str) {
        // Remove leading and trailing spaces using trim(),
        // then split the string by one or more whitespace characters using regex "\\s+"
        String[] words = str.trim().split("\\s+");

        // Return the number of words (i.e., the length of the resulting array)
        return words.length;
    }
}
