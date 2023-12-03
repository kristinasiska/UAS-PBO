import java.util.ArrayList;
import java.time.LocalDate;

public class Account {
    public String accountNumber;
    public double balance;
    public ArrayList<Transaction> transactions;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }
    public void deposit(double amount) { //fitur setor
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount, LocalDate.now().toString()));
        } else {
            System.out.println("Error: Invalid amount for deposit.");
        }
    }
    public void withdraw(double amount) { //fitur tarik
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount, LocalDate.now().toString()));
        } else {
            System.out.println("Error: Invalid amount for withdrawal.");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public ArrayList<Transaction> viewTransactions() {
        return new ArrayList<>(transactions); 
    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<>(transactions); 
    }
}
