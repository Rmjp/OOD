package week2.ex3_6;

public class Account {
    private int number;
    private double balance = 0.0;
    
    /** construct Account */
    public Account(int number) {
        this.number = number;
    }
    
    /** construct Account with balance */
    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    /** get account number */
    public int getNumber() {
        return number;
    }

    /** get account balance */
    public double getBalance() {
        return balance;
    }

    /** set account balance */
    @Override
    public String toString() {
        return "Account[number=" + number + ",balance=" + balance + "]";
    }

    /** credit amount to account */
    public void credit(double amount) {
        balance += amount;
    }

    /** debit amount from account */
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount exceeded");
        }
    }

    /** transfer amount from this account to another */
    public void transferTo(double amount, Account another) {
        if (balance >= amount) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("amount exceeded");
        }
    }
}
