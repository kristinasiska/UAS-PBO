import java.util.ArrayList;

public class UserAdmin{
    public ArrayList<Account> accounts;

    public UserAdmin(){
        this.accounts = new ArrayList<>();
    }
    public void addUserAccount(String accountNuber, double balance){
        accounts.add(new Account(accountNumber, balance));
    }
    public void viewUserAccountDetails(String accountNumber){
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Balance: " + account.getBalance());
            System.out.println("Account Transactions:");
            for (Transaction transaction : account.viewTransactions()) {
                System.out.println(transaction);
            }
        } else {
            System.out.println("Error: Account not found.");
        }
    }
    public Account findAccount(String accountNumber){
        for (Account account : accounts){
            if (account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
}
