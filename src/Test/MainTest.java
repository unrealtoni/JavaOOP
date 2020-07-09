package Test;

import TestBankAccount.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<BankAccount> testList = new ArrayList<>();
        Person test = new Person("Toni",45, testList);

        System.out.println(test);

    }
}
