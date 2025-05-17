/*Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/

// Package declaration (depends on your project structure)
package program1;

public class program3_b5 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the removeWhitespace method with a sample string and print the result
        System.out.println("Without whitespace: " + removeWhitespace(" H e l l o W o r l d "));
    }

    // User-defined method to remove all whitespace characters from a string
    private static String removeWhitespace(String str) {
        // Use regular expression \s to match all types of whitespace (space, tab, newline, etc.)
        return str.replaceAll("\\s", "");
    }
}
