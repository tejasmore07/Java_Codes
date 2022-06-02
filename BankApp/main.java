package BankApp;

public class main {
    public static void main(String[] args) {
        BankApplication balance = new BankApplication();
        balance.setOwner("Tejas more");
        balance.setdipositte(15000);
//        balance.setwithdraw(10000);
//        balance.setdipositte(500);
        balance.setwithdraw(16000);
        balance.display();
    }
}
