package dev.gobank.handler;

import dev.gobank.account.Account;
import dev.gobank.account.AccountManager;
import dev.gobank.auth.AuthManager;
import dev.gobank.person.Identifier;
import dev.gobank.system.SessionContext;

import java.util.Scanner;

public class LoginHandler implements Handler {
    private final Scanner scanner = new Scanner(System.in);
    private final AccountManager accountManager;
    private final AuthManager authManager;

    public LoginHandler(AccountManager accountManager, AuthManager authManager) {
        this.accountManager = accountManager;
        this.authManager = authManager;
    }

    @Override
    public boolean handle(SessionContext context) {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your cpf: ");
        String cpf = scanner.nextLine();

        Identifier identifier = new Identifier(firstName, lastName, cpf);
        Account account = accountManager.getAccountByIdentifier(identifier);

        if (account == null) {
            System.out.println("Account does not exist");
            return false;
        }

        System.out.println(account);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (authManager.authenticate(identifier, password)) {
            System.out.println("You have successfully logged in");
            context.setAccount(account);
            return true;
        } else {
            System.out.println("Wrong password");
            return false;
        }
    }
}
