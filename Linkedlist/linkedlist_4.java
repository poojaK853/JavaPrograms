/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package program1;

import java.util.*;

public class program1_c4 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> ls = new LinkedList<>();

        // Add elements to the LinkedList
        ls.add("Orange");
        ls.add("geen");  // Possible typo, probably meant "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Iterate through the LinkedList using a for loop by index
        for (int i = 0; i < ls.size(); i++) {
            // Print the current index and the element at that index
            System.out.println("index: " + i + " value: " + ls.get(i));
        }
    }
}
