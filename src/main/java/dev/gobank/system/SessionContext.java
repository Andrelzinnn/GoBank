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
