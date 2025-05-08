package dev.gobank.handler;

import dev.gobank.account.AccountManager;
import dev.gobank.auth.AuthManager;

public interface StatelessHandler {
    boolean handleStateless(AccountManager accountManager, AuthManager authManager);
}
