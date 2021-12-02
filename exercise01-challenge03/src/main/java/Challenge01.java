/*
 *  UCF COP3330 Fall 2021 Exercise 1
 *  Copyright 2021 Quinn Gilbert
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Challenge01 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = new Scanner(System.in).nextLine();
        String output = "Hello, "+name+", nice to meet you!";
        JOptionPane.showMessageDialog(null, output);
    }
}