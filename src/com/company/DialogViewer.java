package com.company;


import javax.swing.JOptionPane;

    public class DialogViewer {
       public static void main(String[] args)   {
           String name = JOptionPane.showInputDialog("What is your name?");
           System.out.println("Hello, " + name + "!");
           JOptionPane.showInputDialog(null, "My name is Hal! What would you like me to do? ");
           System.out.println("I am sorry " + name + ". I'm afraid I can't do that.");
       }
}

