package Test;

import TestBankAccount.BankAccount;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<BankAccount> accounts;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    public Person(String name, int age, ArrayList<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

    public double getBalance(){
        return this.accounts.stream().mapToDouble(d -> d.getBalance()).sum();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accounts=" + accounts +
                '}';
    }
}
