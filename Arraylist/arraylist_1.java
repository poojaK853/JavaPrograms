//1. Write a java program for getting different colors through ArrayList interface and search whether
//the color "Red" is available or not
//( Hint : Use ArrayListObj.contains() ) 


import java.util.*;  // Importing utility classes like List and ArrayList

public class p1 {

    public static void main(String[] args) {
        // Creating a List of strings to store color names
        List<String> ls = new ArrayList<>();

        // Adding elements (color names) to the list
        ls.add("Orange");
        ls.add("geen");    // Likely a typo, should be "green"
        ls.add("pink");
        ls.add("red");

        // Printing the entire list
        System.out.println(ls);

        // Checking if the list contains the string "red"
        if(ls.contains("red")) {
            System.out.println("available");  // If found, print "available"
        } else {
            System.out.println("available not");  // If not found, print "available not"
        }
    }
}
