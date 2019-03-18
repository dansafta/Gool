package org.fasttrackit.lab3;

import java.util.Random;
import java.util.Scanner;


public class Lab3ex1 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();


        double mediaAritmetica = (num1 + num2) / 2;

        System.out.println("Media aritmentica a numerelor " + num1 + " si " + num2 + " este " + mediaAritmetica);

        {
            int n, c;
            System.out.println("Enter an integer to print it's multiplication table");
            n = in.nextInt();
            System.out.println("Multiplication table of " + n);

            for (c = 1; c <= 10; c++)
                System.out.println(n + "*" + c + " = " + (n * c));
        }
        {
            System.out.println("Enter number :");
            int num = in.nextInt();
            int reversed = 0;

            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            System.out.println("Reversed Number: " + reversed);
        }


    }

}






