package BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAcc account = new BankAcc();
        account.setId(1);
        account.setBalance(100);
        System.out.println("Начален баланс: " + account.getBalance());
        account.deposit(50);
        System.out.println("Sled 1-va vnoska: "+ account.getBalance());
        account.withdraw(25);
        System.out.println("SLed 1-voteglene balansa na id:1 e: "+ account.getBalance());

        System.out.println(account);
    }
}
