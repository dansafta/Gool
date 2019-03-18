package org.fasttrackit.lab3;

import java.util.Scanner;


public class Lab3ex1 {

            public static void main(String[] args) {

                // Create scanner class object
                Scanner in = new Scanner(System.in);

                // Input two numbers from user
                System.out.println("Enter first number :");
                int num1 = in.nextInt();
                System.out.println("Enter second number :");
                int num2 = in.nextInt();


                double mediaAritmetica = (num1 + num2) / 2;

                System.out.println("Media aritmentica a numerelor " + num1 + " si " + num2 + " este " + mediaAritmetica);


            }
        }


