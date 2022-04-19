/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
 *
 * @author aakar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //String name, color, food;
        //int number=0;
        System.out.println("Hello There!");
        System.out.println("What is your name? ");
        String name = input.nextLine();
        
        System.out.println("Hi, " + name + "I'm Alice.");
        System.out.println("What is your favorite color?");
        String color = input.nextLine();
        
        System.out.println("Huh, " + color + "?" + "Mine's Electric Lime.");
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What is your favorite fruit, " + name + "?");
        String food = input.nextLine();
        
        System.out.println("Really? " + food + "?" + "That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number? ");
        int number = input.nextInt();
        System.out.println(number + "is a cool number." + "Mines -7.");
        System.out.println("Did you know 42 * -7 is -294? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, " + name + "!");
        
        
    }
    
}
