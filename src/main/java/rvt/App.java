package rvt;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Your code goes here...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Same.");
        } else {
            System.out.println("Different.");
        }
        scanner.close();

    }
}
