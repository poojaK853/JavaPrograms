/* Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/

import java.util.*;  // Importing the java.util package for List and ArrayList

public class p2 {

    public static void main(String[] args) {
        // Creating a List of Strings using ArrayList
        List<String> ls = new ArrayList<>();

        // Adding elements (colors) to the list
        ls.add("Orange");
        ls.add("geen");    // Possibly a typo, should be "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Printing the full list before removal
        System.out.println(ls);  // Output: [Orange, geen, pink, red, Blue]

        // Removing the element at index 2 ("pink")
        ls.remove(2);

        // Printing the list after removing the element at index 2
        System.out.println(ls);  // Output: [Orange, geen, red, Blue]

        // Removing the element "Blue" by value
        ls.remove("Blue");

        // Printing the list after removing "Blue"
        System.out.println(ls);  // Output: [Orange, geen, red]
    }
}

