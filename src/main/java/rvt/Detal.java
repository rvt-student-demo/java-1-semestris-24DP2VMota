package rvt;

import java.util.Scanner;

public class Detal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int skruviPrice = 5;
        int uzgrieniPrice = 3;
        int paplāksniPrice = 1;

        System.out.println("Skrūvuju skaits: ");
        int skruvi = scanner.nextInt(); //b/v
        System.out.println("Uzgriežņu skaits: ");
        int uzgrieni = scanner.nextInt(); //g
        System.out.println("Paplāksņu skaits: ");
        int paplāksni = scanner.nextInt(); //sh

        System.out.println();

        if(uzgrieni < skruvi) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu.");
        }
        if(paplāksni < skruvi*2) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu.");
        }
        if(uzgrieni >= skruvi && paplāksni >= skruvi*2) {
            System.out.println("Pasūtījums ir kārtība.");
        }

        System.out.println();
        
        int price = skruvi*skruviPrice + uzgrieni*uzgrieniPrice + paplāksni*paplāksniPrice;
        System.out.println("Kopējā cena: " + price);
    }
}
