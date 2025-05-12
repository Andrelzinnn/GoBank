package dev.gobank.handler;

import dev.gobank.system.SessionContext;
import dev.gobank.transaction.Transaction;

public class DepositHandler implements Handler {
    private final Double transactionAmount;

    public DepositHandler(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public boolean handle(SessionContext currentSession) {
        Transaction transaction = new Transaction();
        return transaction.deposit(currentSession.getAccount(), transactionAmount);
    }
}
