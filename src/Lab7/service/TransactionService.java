package Lab7.service;

import Lab7.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class TransactionService {
    private List<Transaction> transactions;

    public TransactionService() {
        transactions = new ArrayList<>();
    }

    public void makePayment(User user, double amount, Currency currency, String purpose) {
        Payment payment = new Payment(amount, currency, user, purpose);
        Transaction transaction = new Transaction(generateTransactionId(), payment);
        transactions.add(transaction);
    }

    public void cancelTransaction(Transaction transaction) {
        try {
            Transaction clonedTransaction = (Transaction) transaction.clone();
            Payment clonedPayment = (Payment) clonedTransaction.getPayment().clone();
            clonedPayment.setAmount(-clonedPayment.getAmount()); // Setam suma cu minus pentru stornare
            clonedPayment.setPurpose("Stornare " + clonedPayment.getPurpose());
            Transaction stornTransaction = new Transaction(generateTransactionId(), clonedPayment);
            transactions.add(stornTransaction);
        } catch (CloneNotSupportedException e) {
            e.toString();
        }
    }

    public List<Transaction> getTransactionsForUser(User user) {
        List<Transaction> userTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getPayment().getUser().equals(user)) {
                userTransactions.add(transaction);
            }
        }
        return userTransactions;
    }

    public List<Transaction> getTransactions() { return transactions; }

    private String generateTransactionId() {
        return "TRX-" + UUID.randomUUID().toString();
    }
}
