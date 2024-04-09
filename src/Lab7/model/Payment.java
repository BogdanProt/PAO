package Lab7.model;

public class Payment {
    private double amount;
    private Currency currency;
    private User user;
    private String purpose;

    public Payment(double amount, Currency currency, User user, String purpose) {
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.purpose = purpose;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setAmount(double amount) { this.amount = amount; }

    public void setPurpose(String purpose) { this.purpose = purpose; }
    public double getAmount() { return amount; }

    public Currency getCurrency() { return currency; }

    public User getUser() { return user; }

    public String getPurpose() { return purpose; }
}
