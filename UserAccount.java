import java.util.ArrayList;

public class UserAccount extends User{
    public ArrayList<Account> accounts;

    public UserAccount(String name, String email, String address, String phoneNumber) {
        super(name, email, address, phoneNumber);
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public ArrayList<Account> getAccounts(){
        return new ArrayList<>(accounts);
    }
}
