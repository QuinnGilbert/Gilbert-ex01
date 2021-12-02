/*
 *  UCF COP3330 Fall 2021 Exercise 1
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Challenge01 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = new Scanner(System.in).nextLine();
        String output;
        if(name.equals("Quinn")){
            output = "Hey Quinn! Welcome back!";
        }else{
            output = "Hello, "+name+", nice to meet you!";
        }
        System.out.println(output);
    }
}
