package TestBankAccount;

public class BankAccount {
    private int id;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount<=0){
            throw new IllegalArgumentException("Must bigger then 0 !");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            throw new IllegalArgumentException("Insufficient balance");
        }else {
            this.balance -= amount;
        }
    }
    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f",this.id, this.balance);
    }
}
