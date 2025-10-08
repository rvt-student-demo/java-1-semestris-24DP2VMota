package rvt;

public class AdvancedAstrology {
    public static void main(String[] args){
    printTriangle(4);
    }
    public static void printSpaces(int number){
        for(int i = 0; i < number; i++){
            System.out.println(" ");
        }
    }
    public static void printStars(int number){
        for(int i = 0; i < number; i++){
            System.out.println("*");
        }
        System.out.println();
    }
    public static void printTriangle(int size){
        for(int i = 1; i < size + 1; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }
}
