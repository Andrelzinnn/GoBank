package dev.gobank.handler;

import dev.gobank.system.SessionContext;
import dev.gobank.transaction.Transaction;

public class WithdrawHandler implements Handler {
    Double transactionAmount;

    public WithdrawHandler(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public boolean handle(SessionContext currentSession) {
        Transaction transaction = new Transaction();
        return transaction.withdraw(currentSession.getAccount(), transactionAmount);
    }
}
