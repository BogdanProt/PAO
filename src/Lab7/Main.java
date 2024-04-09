package Lab7;

import Lab7.model.*;
import Lab7.service.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService();

        User user1 = new User("John", "Doe", "RO123456789");

        transactionService.makePayment(user1, 100, Currency.EUR, "Shopping");
        transactionService.makePayment(user1, 50, Currency.USD, "Utilities");
        transactionService.makePayment(user1, 75, Currency.RON, "Dining");

        System.out.println("Lista tarilor/zonelor pentru care s-au facut plati:");
        for (Transaction transaction : transactionService.getTransactions()) {
            System.out.println(transaction.getPayment().getCurrency().getCountry());
        }

        System.out.println("\nTranzactii pentru utilizatorul " + user1.getFirstName() + " " + user1.getLastName() + ":");
        List<Transaction> userTransactions = transactionService.getTransactionsForUser(user1);
        for (Transaction transaction : userTransactions) {
            System.out.println("ID: " + transaction.getId() + ", Amount: " + transaction.getAmount() +
                    " " + transaction.getCurrency() + ", Purpose: " + transaction.getPayment().getPurpose());
        }

        Transaction transactionToCancel = userTransactions.get(0); // Alegem prima tranzacție pentru stornare
        transactionService.cancelTransaction(transactionToCancel);
        Transaction canceledTransaction = transactionService.getTransactions().get(transactionService.getTransactions().size() - 1);

        System.out.println("\nTranzactia initiala:");
        System.out.println("ID: " + transactionToCancel.getId() + ", Amount: " + transactionToCancel.getAmount() +
                " " + transactionToCancel.getCurrency() + ", Purpose: " + transactionToCancel.getPayment().getPurpose());
        System.out.println("\nTranzactia finala (stornata):");
        System.out.println("ID: " + canceledTransaction.getId() + ", Amount: " + canceledTransaction.getAmount() +
                " " + canceledTransaction.getCurrency() + ", Purpose: " + canceledTransaction.getPayment().getPurpose());
    }
}
