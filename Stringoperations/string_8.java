/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/

// Package declaration (depends on your project structure)
package program1;

public class program3_c8 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the isNumeric method with a sample string and print the result
        System.out.println("Is numeric: " + isNumeric("12345"));
    }

    // User-defined method to check if a string contains only digits
    private static boolean isNumeric(String str) {
        // Use regular expression to check if the string contains one or more digits only
        // \d matches a digit, and + means one or more occurrences
        return str.matches("\\d+");
    }
}
