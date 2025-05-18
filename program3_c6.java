/*Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/

// Package declaration (depends on your project structure)
package program1;

public class program3_c6 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the capitalizeWords method with a sample sentence and print the result
        System.out.println("Capitalized: " + capitalizeWords("java programming is fun"));
    }

    // User-defined method to capitalize the first letter of each word in a string
    private static String capitalizeWords(String str) {
        // Split the string into words using space as the delimiter
        String[] words = str.split(" ");

        // Use StringBuilder to build the final result
        StringBuilder result = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first character and append the rest of the word
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        // Return the result string with leading/trailing spaces removed
        return result.toString().trim();
    }
}
