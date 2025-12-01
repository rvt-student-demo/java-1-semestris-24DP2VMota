package rvt;
import java.util.Scanner;

public class delikatese {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        double piegade = 2.00;
        System.out.println("Ievadi preci: ");
        String prece = input.nextLine();
        System.out.println("Ievadi cenu: ");
        double cena = Double.valueOf(input.nextDouble());
        System.out.println("Ekspress piegāde (0==nē, 1==jā): ");
        int exp_piegade = Integer.valueOf(input.nextInt());
        double rekins = cena;
        
        if (rekins >= 10){
            if (exp_piegade == 1){
                piegade = 3.00;
            }else{
                piegade = 0.00;
            }
            }else{
                if (exp_piegade == 1){
                    piegade = 5.00;
                }else{
                    piegade = 2.00;
                }
            }

        rekins = cena + piegade;
        System.out.println("Ekspress piegāde (0==nē, 1==jā): ");
}
}
