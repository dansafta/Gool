package org.fasttrackit.lab3;

import java.util.Scanner;

public class RezolvareLab3 {

    static int n;
    static int[] tablou;

    public static void main(String[] args) {


        double value1 = 5.6;

        double value2 = 7.5;
        double mediaAritmetica = (value1 + value2) / 2;

        System.out.println("Media aritmentica a numerelor " + value1 + " si " + value2 + " este " + mediaAritmetica);


        Scanner in = new Scanner(System.in);
        System.out.println("Dati numarul n:");
        n = in.nextInt();
        tablou = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.println("Dati elementul cu nr. " + (i + 1));
            tablou[i] = in.nextInt();
        }
        System.out.println("elementul maxim este " + getMax(tablou));

    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;



    }
}




