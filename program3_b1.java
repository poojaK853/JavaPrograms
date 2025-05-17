/*Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/

package program1;
import java.util.Random;
public class program3_b1 {
	    public static void main(String[] args) {
	        String test1 = "  ";
	        System.out.println("Is null or empty: " + isNullOrEmpty(test1));
	    }

	    private static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }
	}
