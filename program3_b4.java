/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/

// Package declaration (depends on your project structure)
package program1;

public class program3_b4 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the isPalindrome method with the input "Madam" and print the result
        System.out.println("Is palindrome: " + isPalindrome("Madam"));
    }

    // User-defined method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Remove all non-letter characters and convert the string to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Compare the cleaned string with its reverse
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
