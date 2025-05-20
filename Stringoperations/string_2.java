/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/

// Package declaration (depends on your project structure)
package program1;

public class program3_b2 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Define the main string to search within
        String mainStr = "Java is fun, Java is powerful.";

        // Call the countOccurrences method to count how many times "Java" appears
        System.out.println("Occurrences of 'Java': " + countOccurrences(mainStr, "Java"));
    }

    // User-defined method to count how many times subStr appears in mainStr
    private static int countOccurrences(String mainStr, String subStr) {
        int count = 0;      // To store number of occurrences
        int index = 0;      // To track current search position

        // Loop to find all occurrences of subStr
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;                            // Increment count when match found
            index += subStr.length();           // Move index forward to search for next occurrence
        }

        // Return the total count of occurrences
        return count;
    }
}

