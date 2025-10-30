package rvt;
import java.util.Random;
import java.util.*;

public class spele {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int result = random.nextInt(10) + 1;
        int meg = 3;

        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs mēģinājumos.");

        for(int i = 0; i < meg; i++){
            System.out.println("Ievadi mēģinājumu: ");
            int me = sc.nextInt();

            if(me == result){
                System.out.println("PAREIZI!!");
                System.out.println("Tu esi uzvarējis spēli.");
                return;
            } else {
                System.out.println("Nepareizi.");
            }
        }
        System.out.println("Pareizas skaitlis bija " + result + ".");
        System.out.println("Tu esi zaudējis spēli.");
    }
}
