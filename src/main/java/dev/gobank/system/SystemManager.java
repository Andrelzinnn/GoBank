package dev.gobank.system;

import dev.gobank.account.AccountManager;
import dev.gobank.auth.AuthManager;
import dev.gobank.handler.CreateAccountHandler;
import dev.gobank.handler.LoginHandler;

import java.io.Console;
import java.util.Scanner;

public class SystemManager {
    SessionContext currentSession = new SessionContext();
    Scanner scanner = new Scanner(System.in);
    AccountManager accountManager = new AccountManager();
    AuthManager authManager = new AuthManager();

    private final CreateAccountHandler createAccountHandler = new CreateAccountHandler();

    private final LoginHandler loginHandler = new LoginHandler(accountManager, authManager);

    public void init() {
        ConsoleManager.showSignupHeader();
        createAccountHandler.handleStateless(accountManager, authManager);
        ConsoleManager.clearConsole();

        ConsoleManager.showLoginHeader();
        loginHandler.handle(currentSession);
    }

}