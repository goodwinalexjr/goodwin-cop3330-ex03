/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example03;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner quotes = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String Quote = quotes.nextLine();
        System.out.print("Who said it? ");
        String Name = quotes.nextLine();
        System.out.println(Name + " says, \"" + Quote + '\"');
    }
}
