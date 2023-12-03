import java.util.ArrayList;

public class Bank {
    private ArrayList<UserAccount> userAccounts;

    public Bank() {
        userAccounts = new ArrayList<>();
    }
    public void addUserAccount(UserAccount userAccount) {
        userAccounts.add(userAccount);
    }
    public ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }
}
