public class Transaction {
    public String transactionType;
    public double amount;
    public String transactionDate;

    public Transaction(String transactionType, double amount, String transactionDate) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    // Getters and setters
}
