package Lab7.model;
import Lab7.service.*;

public class Transaction extends ConversionCalculatorImpl implements Cloneable{
    private String id;
    private Payment payment;
    private Currency currency;
    private double amount;
    private String refNmb;

    public Transaction(String id, Payment payment) {
        super();
        this.id = id;
        this.payment = payment;
        this.amount = conversionValutaToEur(payment.getCurrency());
        this.currency = Currency.EUR;
        this.refNmb = null;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Transaction clonedTransaction = (Transaction) super.clone();
        clonedTransaction.amount *= -1;
        clonedTransaction.refNmb = this.id;
        return clonedTransaction;
    }

    public String getId() { return id; }

    public Payment getPayment() { return payment; }

    public Currency getCurrency() { return currency; }

    public double getAmount() { return amount; }

    public String getRefNmb() { return refNmb; }
}
