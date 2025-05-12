package dev.gobank.handler;

import dev.gobank.account.Account;
import dev.gobank.system.SessionContext;
import dev.gobank.transaction.Transaction;

public class TransferHandler implements Handler {
    Account target;
    Double transactionAmount;

    public TransferHandler(Account target, Double transactionAmount) {
        this.target = target;
        this.transactionAmount = transactionAmount;
    }

    @Override
    public boolean handle(SessionContext currentSession) {
        Transaction transaction = new Transaction();
        return transaction.transfer(currentSession.getAccount(), this.target, transactionAmount);
    }
}
