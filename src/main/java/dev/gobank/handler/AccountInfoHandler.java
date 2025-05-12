package dev.gobank.handler;

import dev.gobank.system.SessionContext;

public class AccountInfoHandler implements Handler{

    @Override
    public boolean handle(SessionContext currentSession) {
        if (currentSession.isLoggedOut()) {return false;}
        System.out.println("Account info");
        System.out.println(currentSession.getAccount());
        return true;
    }
}
