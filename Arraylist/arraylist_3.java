/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/

import java.util.*;  // Importing utility classes including List, ArrayList, and Collections

public class p3 {

    public static void main(String[] args) {
        // Creating a List of Strings to store color names
        List<String> ls = new ArrayList<>();

        // Adding elements (color names) to the list
        ls.add("Orange");
        ls.add("geen");    // Likely a typo, should be "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Printing the list before sorting
        System.out.println("Before sorting:");
        System.out.println(ls);  // Output will show the order of insertion

        // Sorting the list in ascending (lexicographical) order
        Collections.sort(ls);

