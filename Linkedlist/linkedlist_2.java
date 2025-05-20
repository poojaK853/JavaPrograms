/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/

package program1;

import java.util.Iterator;
import java.util.LinkedList;

public class program1_c2 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> ls = new LinkedList<>();

        // Add elements to the LinkedList
        ls.add("Orange");
        ls.add("geen");   // Note: probably a typo, should be "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        /*
        // Alternative way to iterate in reverse order using ListIterator
        ListIterator<String> listIterator = ls.listIterator(ls.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        */

        // Create a descending iterator to traverse the list in reverse order
        Iterator<String> iterator = ls.descendingIterator();

        // Iterate over the LinkedList in reverse and print each element
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


	}

