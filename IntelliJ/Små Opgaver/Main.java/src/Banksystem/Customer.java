package Banksystem;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Customer {

    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != " " && name != null && name.length() > 1) {
            this.name = name;
        } else
                this.name = "NN";
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Customer(int balance, String name) {
        this.balance = balance;
        this.name = name;


    }

    @Override
    public String toString() {
        return "Customer: " +
                "name = " + name +
                ", balance = " + balance;
    }
}

