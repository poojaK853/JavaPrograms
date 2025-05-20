/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/

import java.util.*;  // Importing the java.util package to use List, ArrayList, etc.

public class p4 {

    public static void main(String[] args) {
        // Creating a list of strings to store color names
        List<String> ls = new ArrayList<>();

        // Adding elements (colors) to the list
        ls.add("Orange");
        ls.add("geen");   // Possibly a typo, should be "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Printing the full list
        System.out.println(ls);  // Output: [Orange, geen, pink, red, Blue]

        // Using subList() to get a portion of the list
        // subList(fromIndex, toIndex) returns elements from fromIndex (inclusive) to toIndex (exclusive)
        System.out.println("using sublist:");
        System.out.println(ls.subList(0, 2));  // Output: [Orange, geen]
    }
}

