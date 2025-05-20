/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/

package program1;  // Declaring the package (optional, based on your project structure)

import java.util.*;  // Importing utility classes including List, LinkedList, Iterator

public class program1_c1 {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        List<String> ls = new LinkedList<>();

        // Adding color names to the list
        ls.add("Orange");
        ls.add("geen");    // Likely a typo, should be "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Creating a ListIterator starting from index 2
        // So the iteration will start from "pink"
        Iterator iterator = ls.listIterator(2);

        // Iterating from index 2 to the end of the list
        while (iterator.hasNext()) {
            // Printing each element from index 2 onward
            System.out.println(iterator.next());
        }
    }
}
