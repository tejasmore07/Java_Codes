package ConstructorDemo;

class Bank {
    private String bank_name;
    private long account_no;
    private String ifsc_no;
    private Double avl_balance;

    public void setMethod(String bank_name,long account_no,String ifsc_no,Double avl_balance) {
        this.bank_name = bank_name;
        this.account_no = account_no;
        this.ifsc_no = ifsc_no;
        this.avl_balance = avl_balance;
    }
    public String getBank_name() {
        return bank_name;
    }
    public long getAccount_no() {
        return account_no;
    }
    public String getIfsc_no(){
        return ifsc_no;
    }
    public Double getAvl_balance() {
        return avl_balance;
    }
    void display(){
        System.out.println("Bank Name : " + getBank_name());
        System.out.println("Account No : " + getAccount_no());
        System.out.println("IFSC Code : " + getIfsc_no());
        System.out.println("Avl Balance : " + getAvl_balance());
        System.out.println();
    }
}
public class Account {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setMethod("SBI Bank",778544686659l,"SBIN0012345",50000.00);
        b1.display();
        Bank b2 = new Bank();
        b2.setMethod("MAHA Bank",521268975548l,"MAHA012345",30500.50);
        b2.display();
        Bank b3 = new Bank();
        b3.setMethod("ICICI Bank",4578965356549l,"ICICI012345",10.00);
        b3.display();
    }
}
