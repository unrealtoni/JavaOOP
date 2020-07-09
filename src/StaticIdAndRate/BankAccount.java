package StaticIdAndRate;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;

    private static int idSequence;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private double balance;
    private int id;

    public BankAccount(){
        this.id = ++idSequence;
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterestRate(int years) {
        return this.balance*interestRate*years;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
