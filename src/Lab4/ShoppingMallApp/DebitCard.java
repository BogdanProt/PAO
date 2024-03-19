package Lab4.ShoppingMallApp;

public class DebitCard implements BankCard{
    private static double spentAmount;
    private String user;
    private double limitAmount;

    public void setUser(String user) { this.user = user; }
    public void setLimitAmount(double limitAmount) { this.limitAmount = limitAmount; }
    public double getSpentAmount() { return spentAmount; }
    public String getUser() { return user; }
    public double getLimitAmount() { return limitAmount; }
    @Override
    public void doTransaction(double amount){
        spentAmount += amount;
        if (spentAmount > limitAmount){
            System.out.println("Not enough money");
        } else {
            System.out.println("Utilizator " + user + " a cheltuit " + amount);
            System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);
        }
    }
}
