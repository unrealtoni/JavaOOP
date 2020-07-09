package StaticIdAndRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        while (!line.equalsIgnoreCase("End")) {
            String[] commArgs = line.split(" ");
            switch (commArgs[0]) {
                case "Create":
                    BankAccount acc = new BankAccount();
                    accounts.put(acc.getId(),acc);
                    System.out.println("Account ID" +acc.getId()+" created");
                    break;

                case "Deposit":
                    int id = Integer.parseInt(commArgs[1]);
                    double amount = Double.parseDouble(commArgs[2]);
                    try {
                        accounts.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n",amount,id);
                    }catch (Exception ex){
                        System.out.println("Account does not exist");
                        break;
                    }
                    break;

                case "SetInterest":
                    double interest = Double.parseDouble(commArgs[1]);
                    BankAccount.setInterestRate(interest);
                    break;

                case "GetInterest":
                    int idAcc = Integer.parseInt(commArgs[1]);
                    int year = Integer.parseInt(commArgs[2]);
                    try {
                        System.out.println(accounts.get(idAcc).getInterestRate(year));

                    }catch (Exception ex){
                        System.out.println("Account does not exist");
                        break;
                    }
                    break;
            }
            line = reader.readLine();
        }
    }
}
