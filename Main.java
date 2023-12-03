import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        UserAccount userAccount1 = new UserAccount("Aurora Caecillia", "roraitsme@example.com", "2812 Sidokare", "8890-0002-8991");
        bank.addUserAccount(userAccount1);

        Account checkingAccount1 = new CheckingAccount("1234567890", 1000);
        userAccount1.addAccount(checkingAccount1);

        BankTeller bankTeller = new BankTeller();
        bankTeller.deposit(userAccount1, checkingAccount1, 500);

        ATM atm = new ATM();
        atm.withdraw(userAccount1, checkingAccount1, 200);

        // Other users, accounts, and transactions

        // Print account information
        System.out.println("User Name: " + userAccount1.getName());
        System.out.println("User Email: " + userAccount1.getEmail());
        System.out.println("User Address: " + userAccount1.getAddress());

        // Print account balance
        System.out.println("Account Balance: " + checkingAccount1.getBalance());

        // Print transactions
        ArrayList<Transaction> transactions = checkingAccount1.getTransactions();
        System.out.println("\nTransactions: ");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
