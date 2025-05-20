/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/

// Package declaration (depends on your project structure)
package program1;

// Correct import statement for Random
import java.util.Random;

public class program3_c9 {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the generateRandomString method to create a random string of length 8
        System.out.println("Random String: " + generateRandomString(8));
    }

    // User-defined method to generate a random alphanumeric string of given length
    private static String generateRandomString(int length) {
        // Characters to choose from (uppercase, lowercase, digits)
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // Create an instance of Random to generate random indices
        Random rand = new Random();
        
        // Use StringBuilder to build the random string
        StringBuilder sb = new StringBuilder();

        // Loop to generate each character in the random string
        for (int i = 0; i < length; i++) {
            // Append a random character from 'chars' to the StringBuilder
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }

        // Convert StringBuilder to String and return
        return sb.toString();
    }
}
