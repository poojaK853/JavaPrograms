/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/

// Package declaration (depends on your project structure)
package program1;

public class program3_c7 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the truncate method with a string and a maximum length, then print the result
        System.out.println("Truncated: " + truncate("This is a long string", 10));
    }

    // User-defined method to truncate a string to a given length
    private static String truncate(String str, int length) {
        // If the string's length is greater than the specified limit,
        // return a substring from 0 to 'length' and add "..." at the end.
        // Otherwise, return the original string as is.
        return str.length() > length ? str.substring(0, length) + "..." : str;
    }
}
