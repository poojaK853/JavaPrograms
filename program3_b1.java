/*Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/

// Package declaration (depends on your project structure)
package program1;

// Importing Random class (not used in this code, can be removed if unnecessary)
import java.util.Random;

public class program3_b1 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Define a test string with only whitespace
        String test1 = "  ";
        
        // Call the isNullOrEmpty method and print the result
        System.out.println("Is null or empty: " + isNullOrEmpty(test1));
    }

    // User-defined method to check if a string is null or contains only whitespace
    private static boolean isNullOrEmpty(String str) {
        // Return true if the string is null or, after trimming, is empty
        return str == null || str.trim().isEmpty();
    }
}
