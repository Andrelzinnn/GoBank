package dev.gobank.system;

import dev.gobank.account.Account;
import dev.gobank.person.Identifier;

public class SessionContext {
    Account account;
    Identifier identifier;

    public SessionContext() {}

    public SessionContext(Account account, Identifier identifier) {
        this.account = account;
        this.identifier = identifier;
    }

    public boolean isLoggedIn() {
        return account != null;
    }

    public boolean isLoggedOut() {
        return account == null;
    }

    public boolean cleanup() {
        this.account = null;
        this.identifier = null;
        return true;
    }

    public boolean exitSession() {
        if (account == null && identifier == null) {return false;}
        return cleanup();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }
}
