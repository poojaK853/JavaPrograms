/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/

// Package declaration (optional, depends on your project structure)
package program1;

public class program3_b3 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the reverseString method with "Hello" and print the result
        System.out.println("Reversed: " + reverseString("Hello"));
    }

    // User-defined method to reverse a given string
    private static String reverseString(String str) {
        // Use StringBuilder to reverse the string and return it
        return new StringBuilder(str).reverse().toString();
    }
}
