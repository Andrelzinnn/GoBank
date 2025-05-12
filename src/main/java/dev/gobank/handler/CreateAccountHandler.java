package dev.gobank.handler;

import dev.gobank.account.Account;
import dev.gobank.account.AccountManager;
import dev.gobank.auth.AuthManager;
import dev.gobank.person.Identifier;
import dev.gobank.person.Person;
import dev.gobank.system.SessionContext;

import java.util.Scanner;

public class CreateAccountHandler implements StatelessHandler {
    Person person;
    Identifier identifier;
    Scanner scanner = new Scanner(System.in);


    @Override
    public boolean handleStateless(AccountManager accountManager, AuthManager authManager) {
        String firstName, lastName, gender, cpf, email, phone, address, passwd;
        int age;
        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter your gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter your cpf: ");
        cpf = scanner.nextLine();
        System.out.print("Enter your phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        System.out.print("Enter your address: ");
        address = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your password: ");
        passwd = scanner.nextLine();

        this.person = new Person(firstName, lastName, age, gender, cpf, phone, email, address);
        this.identifier = new Identifier(cpf);

        accountManager.addAccount(person, identifier);
        authManager.register(identifier, passwd);
        System.out.println("Your account has been created.");
        System.out.println();
        System.out.print("Account Information:");
        System.out.println(person);

        return true;
    }
}
