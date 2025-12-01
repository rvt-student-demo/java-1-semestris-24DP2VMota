package rvt;

public class Payment_card {

    private double balance;

    public Payment_card(double openingBalance){
        balance = openingBalance;
    }

    public void addMoney(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public void eatAffordably() {
        if (balance >= 2.60){
            balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.60){
            balance -= 4.60;
        }
    }

    public String toString(){
        String string = "The card has balance of " + balance + " euros";
        return string;
    }

public static void main(String[] args) {
        Payment_card paulsCard = new Payment_card(20);
        Payment_card mattsCard = new Payment_card(30);

        mattsCard.eatAffordably();
        paulsCard.eatHeartily();
    
        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        System.out.println(paulsCard);
        System.out.println(mattsCard);
}
}