package dev.gobank.handler;

import dev.gobank.system.SessionContext;

public class BalanceHandler implements Handler {

    @Override
    public boolean handle(SessionContext currentSession) {
        if (currentSession.isLoggedOut()) {return false;}
        System.out.println("Account balance is $" + currentSession.getAccount().getBalance());
        return true;
    }
}
