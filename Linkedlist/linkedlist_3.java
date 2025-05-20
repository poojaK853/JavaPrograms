/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package program1;

import java.util.*;

public class program1_c3 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> ls = new LinkedList<>();

        // Add elements to the LinkedList
        ls.add("Orange");
        ls.add("geen");  // Possibly a typo, intended "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Print the LinkedList to show the current elements
        System.out.println(ls);

        // Add another element at the end of the LinkedList using addLast()
        ls.addLast("pink");

        // Print the LinkedList again to show the updated list with the new element
        System.out.println(ls);
    }
}
