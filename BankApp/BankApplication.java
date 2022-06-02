package BankApp;

public class BankApplication {
    private String owner;
    private double amount;

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    public void setdipositte(double amount) {
        if(amount>0){
            this.amount = this.amount+amount;
        }
    }
    public void setwithdraw(double amount) {
        if (amount<=this.amount) {
            this.amount = this.amount-amount;
        } else {
            System.err.println("Need to maintain balance");
        }
    }
    public double getAmount () {
        return amount;
    }
    public void display() {
            System.out.println("Owner Name : " + getOwner());
            System.out.println("Amount : " + getAmount());
    }
}
