package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Jonas", "Outzen", "Faster_Jones");
        Customer customer2 = new Customer("Dennis", "Marcussen", "DenMarc12");
        Customer customer3 = new Customer("Marcus", "Michaelsen", "MarcMichael");
        Customer customer4 = new Customer("Knud", "Knudsen", "Knuseren69");

       // System.out.println(customer1.toString());

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        printCustomers(customerList);
    }

    public static void printCustomers(ArrayList<Customer> customerList) {
        for (Customer c : customerList) {
            System.out.println(customerList.toString());
        }
    }
}