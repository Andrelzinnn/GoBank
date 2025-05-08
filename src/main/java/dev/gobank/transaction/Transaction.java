package dev.gobank.transaction;

import dev.gobank.account.Account;

public class Transaction {
    public boolean withdraw(Account holder, double amount) {
        if (amount <= 0 || holder.getBalance() < amount) {
            return false;
        }
        holder.setBalance(holder.getBalance() - amount);
        return true;
    }

    public boolean deposit(Account holder, double amount) {
        if (amount <= 0) {
            return false;
        }
        holder.setBalance(holder.getBalance() + amount);
        return true;
    }

    public boolean transfer(Account holder, Account target, double amount) {
        boolean success = withdraw(holder, amount);
        if (!success) {
            return false;
        }

        return deposit(target, amount);
    }
}
