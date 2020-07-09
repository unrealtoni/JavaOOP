package TestBankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, BankAccount> clients = new HashMap<>();
        String commands = reader.readLine();
        while (!commands.equals("End")) {
            String[] cmdArgs = commands.split("\\s+");
            int id = Integer.parseInt(cmdArgs[1]);
            switch (cmdArgs[0]) {
                case "Create":
                    if (clients.containsKey(id)) {
                        System.out.println("Account already exists");
                    } else {
                        BankAccount newClient = new BankAccount();
                        newClient.setId(id);
                        clients.put(id, newClient);
                    }
                    break;
                case "Deposit":
                    double amount = Double.parseDouble(cmdArgs[2]);
                    if (clients.get(id) != null) {
                        try{
                        clients.get(id).deposit(amount);
                        }catch (IllegalArgumentException ex){
                            System.out.println(ex.getMessage());
                        }

                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "Withdraw":
                    BankAccount account1 = clients.get(id);
                    if (account1 != null){
                        try {
                            account1.withdraw(Double.parseDouble(cmdArgs[2]));
                        }catch (IllegalArgumentException ex){
                            System.out.println(ex.getMessage());
                        }
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "Print":
                    if (clients.get(id) !=null) {
                        System.out.println(clients.get(id));
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
            commands = reader.readLine();
        }
    }
}
