package rvt;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true) {
            System.out.println("Give a number: ");
            int a = scanner.nextInt();
            sum = sum + a;
            if(a == 0) {
                break;
            }
            count++;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
