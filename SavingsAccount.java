import java.time.LocalDate;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interestAmount = balance * interestRate;
        balance += interestAmount;
        transactions.add(new Transaction("Interest", interestAmount, LocalDate.now().toString()));
    }

    // Getters and setters
}
