/*Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/

package program1;

public class program3_b5 {

    public static void main(String[] args) {
        // Call the removeWhitespace method with a sample string and print the result
        System.out.println("Without whitespace: " + removeWhitespace(" H e l l o W o r l d "));
    }

    /**
     * This method removes all whitespace characters from the given string.
     * @param str The input string possibly containing whitespace
     * @return A new string with all whitespace removed
     */
    private static String removeWhitespace(String str) {
        // Use regular expression "\\s" to match all whitespace characters and replace them with an empty string
        return str.replaceAll("\\s", "");
    }
}
