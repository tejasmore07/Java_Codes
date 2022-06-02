package CAPGQ;

import java.util.Scanner;

public class BinarySearch {
    static class Customer{
        String id;
        String name;
        String city;

        public Customer(String id, String name, String city){
            this.id = id;
            this.name = name;
            this.city = city;
        }
    }
    public static void main(String[] args){
        Customer[] customers = new Customer[5];

        customers[0] = new Customer("1001", "Raj", "Chennai");
        customers[1] = new Customer("1002", "Simrath", "Amristar");
        customers[2] = new Customer("1005", "Ganesh", "Chennai");
        customers[3] = new Customer("1008", "Akshay", "Pune");
        customers[4] = new Customer("1204", "Gaurav", "Delhi");

        Scanner sc = new Scanner(System.in);

        String key = sc.next();
        sc.close();

        int first = 0;
        int last = customers.length-1;
        int mid = (first+last)/2;
        while(first<=last){
            if(customers[mid].name.equals(key)){
                int fid = mid + 1;
            }else if(customers[mid].name.equals(key)){
                Customer customer = customers[mid];
                System.out.println(customer.id);
                System.out.println(customer.name);
                System.out.println(customer.city);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first+last)/2;
        }
        if(first>last){
            System.out.println("No Record Found");
        }
    }
}
