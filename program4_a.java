/*Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/

package swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

// Correct class name to match constructor
public class program4_a {

    // Constructor to build the Swing UI
    program4_a() {
        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set the initial size of the frame
        jfrm.setSize(600, 150);  // Increased width for long text

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!");

        // Set font and color properties for the label
        jlab.setFont(new Font("Verdana", Font.PLAIN, 24));
        jlab.setForeground(new Color(0, 0, 255));  // Blue text

        // Add the label to the frame
        jfrm.add(jlab);

        // Make the frame visible
        jfrm.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new program4_a();  // Create instance to display the GUI
            }
        });
    }
}
