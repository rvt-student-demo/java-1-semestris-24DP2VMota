package rvt;
import java.util.*;

public class chapter44 {
    public static void main(String[] args) {
        ex1(); ex2(); ex3(); ex4(); ex5(); ex6(); ex7();
    }
    public static void ex1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise 1:");

        System.out.println("Enter your name: ");
        String name = sc.nextLine().trim();
        int spaceIn = name.indexOf(" ");
        String firstN = name.substring(0, spaceIn);
        String secondN = name.substring(spaceIn + 1);

        System.out.println(firstN + " " + secondN.toUpperCase());
        System.out.println();
    }

    public static void ex2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise 2:");

        System.out.println("Enter a string: ");
        String name = sc.nextLine();

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
        System.out.println();
    }

    public static void ex3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise 3:");
        while(true){
            System.out.println("Enter a name: ");
            String name = sc.nextLine();
            if(name.length() == 0){
                break;
            }
            String lower = name.toLowerCase();
            boolean fem = lower.startsWith("amy") || lower.startsWith("buffy") || lower.startsWith("cathy");
            boolean male = lower.startsWith("elroy") || lower.startsWith("fred") || lower.startsWith("graham");
            if(fem){
                System.out.println("Ms. " + name);
                System.out.println();
            } else if(male){
                System.out.println("Mr. " + name);
                System.out.println();
            } else{
                System.out.println(name);
            }
        }
        
        System.out.println();
    }

    public static void ex4(){
        System.out.println("Exercise 4: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cook time-> ");
        String s = sc.nextLine();
        int minutes;
        int seconds;

        if(s.length() <= 2){
            minutes = 0;
            seconds = Integer.parseInt(s);
        } else {
            String minPart = s.substring(0, s.length() - 2);
            String secPart = s.substring(s.length() - 2);
            minutes = Integer.parseInt(minPart);
            seconds = Integer.parseInt(secPart);
        }
        if(seconds < 10){
            System.out.println("Your time-> " + minutes + ":0" + seconds);
        } else {
            System.out.println("Your time-> " + minutes + ":" + seconds);
        }
        System.out.println();
    }

    public static void ex5(){
        System.out.println("Exercise 5: ");
        Scanner sc = new Scanner(System.in);
        boolean book = false;
        while(sc.hasNextLine()){
            String line = sc.nextLine().trim();
            if(line.startsWith("//")){
                System.out.println(line);
            } else if(line.startsWith("/*")){
                book = true;
                System.out.println(line);
            } else if(line.startsWith("*/")){
                System.out.println(line);
                book = false;
            } else if(book){
                System.out.println(line);
            }
            break;
        }
        System.out.println();
    }

    public static void ex6(){
        System.out.println("Exercise 6: ");
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter your password: ");
            String pwd = sc.nextLine();
            if(pwd.length() < 7) {
                System.out.println("The password is not acceptable.");
                System.out.println();
                continue;
            }

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            for(int i = 0; i < pwd.length(); i++){
                char ch = pwd.charAt(i);
                if(Character.isUpperCase(ch)) hasUpper = true;
                if(Character.isLowerCase(ch)) hasLower = true;
                if(Character.isDigit(ch)) hasDigit = true;
            }
            if(hasLower && hasLower && hasDigit){
                System.out.println("Acceptable password.");
                break;
            } else {
                System.out.println("That password is not acceptable.");
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void ex7(){
        System.out.println("Exercise 7: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word-> ");
        String word = sc.nextLine();
        while(word.length() > 0) {
            System.out.println(word);
            word = " " + word.substring(1);
            word = word.substring(1, word.length() - 1);
        }
        System.out.println();
    }
}
