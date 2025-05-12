package dev.gobank.handler;

import dev.gobank.system.SessionContext;


public class LogoutHandler implements Handler {

    @Override
    public boolean handle(SessionContext context) {
        return context.exitSession();

    }

}
