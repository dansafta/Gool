package org.fasttrackit.lab3;

import java.util.Scanner;

public class summul {

    public static int produsCifre(int nr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dati numarul n:");
        int produs = 1;
        while (nr > 0) {
            produs = produs*( nr % 10);
            nr = nr / 10;
            System.out.println("rezultat inmultire" + produs);
        }
        return produs;}

}

