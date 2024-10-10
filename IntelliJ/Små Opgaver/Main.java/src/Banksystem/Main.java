package Banksystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(100, "Sally");
        Customer c2 = new Customer(200, "John");
        Customer c3 = new Customer(300, "Mary");
        Bank spar = new Bank("Sparekassen");
        spar.addCustomer(c1);
        spar.addCustomer(c2);
        spar.addCustomer(c3);

        System.out.println(spar);
        System.out.println("------------------");
        c1.setBalance(200);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
