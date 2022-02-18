package com.blz;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner ( System.in);
        System.out.println ("Please enter the number");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c = a - b ;

        System.out.println("The sum of numbers is: " + c);
    }
}

