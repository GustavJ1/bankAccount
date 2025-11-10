public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        balance= initialBalance;

    }
    public void deposit(double amount){
        setBalance(balance + amount);
    }
    public void withdraw (double amount){
        setBalance(balance - amount);
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double amount){
        if (amount >0){
            balance =amount;
        }
    }
}
