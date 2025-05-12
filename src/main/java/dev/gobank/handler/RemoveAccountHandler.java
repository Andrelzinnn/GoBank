package dev.gobank.handler;

import dev.gobank.account.AccountManager;
import dev.gobank.auth.AuthManager;
import dev.gobank.person.Identifier;

public class RemoveAccountHandler implements StatelessHandler {
    Identifier identifier;

    public RemoveAccountHandler(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean handleStateless(AccountManager accountManager, AuthManager authManager) {
        return accountManager.removeAccount(identifier) && authManager.removeAuth(identifier);
    }
}
