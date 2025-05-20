/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/

import java.util.*;  // Importing the java.util package for List, ArrayList, etc.

public class p5 {

    public static void main(String[] args) {
        // Creating a list of strings to store color names
        List<String> ls = new ArrayList<>();

        // Adding color names to the list
        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // The string to be removed from the list
        String Str = "green";

        // Printing the original list
        System.out.println(ls);  // Output: [Orange, green, pink, red, Blue]

        // Removing the element "green" by value (not by index)
        // The remove(Object o) method returns true if the element was found and removed
        System.out.println("Removing the element 'green': " + ls.remove(Str));  // Output: true

        // Printing the updated list after removal
        System.out.println(ls);  // Output: [Orange, pink, red, Blue]
    }
}
