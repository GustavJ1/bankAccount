public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;

    }

    public void deposit(double amount) {
        setBalance(balance + amount);
    }

    public void withdraw(double amount) {
        setBalance(balance - amount);

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;

        } else {
            throw new IllegalArgumentException("du må ikke hæve mere end der er på kontoen");

        }
    }
}
