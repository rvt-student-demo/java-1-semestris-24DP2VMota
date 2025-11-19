package rvt;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Statistics all = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers:");

        while(true){
            int number = sc.nextInt();
            if(number == -1){
                break;
            }

            all.addNumber(number);

            if(number % 2 == 0){
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }

        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
