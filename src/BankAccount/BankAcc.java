package BankAccount;

public class BankAcc {
    private int id;
    private double balance;

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    @Override
    public String toString(){
        return String.format("Account with id: %d have balance: %.2f",this.id,this.balance);
    }
}
