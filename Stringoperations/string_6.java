/*Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/

import java.util.Scanner;

public class CapitalizeEachWord {

    // User-defined function to capitalize each word
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and append rest of the word
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }

        // Remove trailing space
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Call the function and display result
        String result = capitalizeWords(input);
        System.out.println("Capitalized Sentence: " + result);

        scanner.close();
    }
}
