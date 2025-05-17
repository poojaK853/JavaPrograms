/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/

package program1;

public class program3_b2 {
	    public static void main(String[] args) {
	        String mainStr = "Java is fun, Java is powerful.";
	        System.out.println("Occurrences of 'Java': " + countOccurrences(mainStr, "Java"));
	    }

	    private static int countOccurrences(String mainStr, String subStr) {
	        int count = 0, index = 0;
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }
	}

