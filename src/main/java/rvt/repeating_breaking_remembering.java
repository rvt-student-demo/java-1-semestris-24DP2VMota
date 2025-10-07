package rvt;

import java.util.Scanner;

public class repeating_breaking_remembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int odd= 0;
        int even = 0;
        int count = 0;
        int avarage = 0;
        int sum = 0;
        while (true) {
            int n = scanner.nextInt();
            sum = sum+n;
            if(n % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd+1;
            }
            if(n == -1) {
                break;
            }
            count++;
        }
        sum= sum + 1;
        odd = odd - 1;
        avarage = sum/count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers:" + count);
        System.out.println("Avarage:" + avarage);
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
    }
}
