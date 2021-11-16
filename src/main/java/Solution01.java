/*
 *  UCF COP3330 Fall 2021 Exercise 1
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution01 {
    public static void main(String[] args) {
        //print prompt
        System.out.print("What is your name? ");
        //input name
        String name = new Scanner(System.in).nextLine();
        //concatenate output
        String output = "Hello, "+name+", nice to meet you!";
        //print greeting
        System.out.println(output);
    }
}
