package com.company;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args)  throws Exception {
        URL imageLocation = new URL(
                "http://horstman.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null, " Hi, I am a new java coder. How are you doing?", "Title",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));

        }

}


