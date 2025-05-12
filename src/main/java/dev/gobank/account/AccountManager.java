package dev.gobank.account;

import dev.gobank.person.Identifier;
import dev.gobank.person.Person;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private int accountId = 0;
    private final Map<String, Account> accounts = new HashMap<String, Account>();

    public boolean addAccount(Person person, Identifier identifier) {
        int id = this.accountId++;
        String token = identifier.getKey();
        Account account = new Account(id, person, id + 10000, "Checking Account");
        if (accounts.containsKey(token)) {return false;}
        accounts.put(token, account);
        return true;
    }

    public boolean removeAccount(Identifier identifier) {
        String token = identifier.getKey();
        if (!accounts.containsKey(token)) {return false;}
        accounts.remove(token);
        return true;
    }


    public Account getAccountByIdentifier(Identifier identifier) {
        String token = identifier.getKey();
        return accounts.get(token);
    }

}
