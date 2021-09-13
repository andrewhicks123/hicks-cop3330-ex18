/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;

import java.util.*;
import java.text.*;


public class App 
{
    public static void main( String[] args )
    {
        Scanner n = new Scanner(System.in);

        System.out.println( "Press C to convert from Fahrenheit to Celsius." );
        System.out.println( "Press F to convert from Celsius to Fahrenheit." );
        System.out.print("Your choice: ");
        String choice = n.next();

        if(choice.equals("C") == true){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int f = n.nextInt();
            int c = (f-32) * 5 / 9;
            System.out.println("The temperature in Celsius is "+ c);
        }
        if(choice.equals("F") == true){
            System.out.print("Please enter the temperature in Celsius: ");
            int c2 = n.nextInt();
            int f2 = (c2 * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is "+ f2);
        }
    }
}
