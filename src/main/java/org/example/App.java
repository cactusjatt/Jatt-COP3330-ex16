/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = in.nextInt();

        String st = age > 15? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(st);
        in.close();
    }
}