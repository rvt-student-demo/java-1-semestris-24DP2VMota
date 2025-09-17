package rvt;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Your code goes here...
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed: ");

        int speed = Integer.valueOf(scanner.nextInt());

        if(speed >= 120){
            System.out.println("Speeding ticket");
        }
        scanner.close();

    }
}
