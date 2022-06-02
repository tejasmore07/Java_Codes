package CAPGQ;

import java.util.Scanner;

class User {
    private int userId;
    private String emailId;
    private String pass;
    private String fname;
    private String lname;
    private String city;
    private String gender;
    private int phoneNum;

    public User() {
        super();
    }
    public User (int userId,String emailId,String pass,String fname,String lname,String city,String gender,int phoneNum) {
        this.userId=userId;
        this.emailId=emailId;
        this.pass=pass;
        this.fname=fname;
        this.lname=lname;
        this.city=city;
        this.gender=gender;
        this.phoneNum=phoneNum;
    }

    @Override
    public String toString() {
        return "User[userId=" + this.userId + ", emailId=" + this.emailId  + ", pass=" + this.pass +", fname=" + this.fname + ", lname=" + this.lname + ", city=" + this.city + ", gender=" + this.gender +", phoneNum=" + phoneNum + ']';
    }
}
public class Source {
    public static void main(String[] args) {
        User bangalore = new User(1001,"abc1@gmail.com","password1","Harry","potter","Bangalore","male",1234567892);
        Scanner scan = new Scanner(System.in);
        String city = scan.next();

        switch (city.toLowerCase()) {
            case "bangalore" :
                System.out.println(bangalore);
                break;
            default:
                System.out.println("No City Found");
        }

    }

}
