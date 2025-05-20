/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/

package program1;

import java.util.*;

public class program1_c5 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> ls = new LinkedList<>();

        // Add elements to the LinkedList
        ls.add("Orange");
        ls.add("geen");  // Possible typo, probably meant "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Print the list before swapping
        System.out.println("Before swapping");
        System.out.println(ls);

        // Swap elements at index 2 and 3 using Collections.swap()
        // This will swap "pink" (index 2) with "red" (index 3)
        Collections.swap(ls, 2, 3);

        // Print the list after swapping to show the changes
        System.out.println("After swapping");
        System.out.println(ls);
    }
}



