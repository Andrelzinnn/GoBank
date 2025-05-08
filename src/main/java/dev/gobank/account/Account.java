package dev.gobank.account;

import dev.gobank.person.Person;

public class Account {
    private int id;
    private double balance;
    private Person owner;
    private int accountNumber;
    private String accountType;

    public Account(){}

    public Account(int id, Person owner, int accountNumber, String accountType) {
        this.id = id;
        this.balance = 0;
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.accountType = accountType;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nOwner: %s\nAccountNumber: %d\nAccountType: %s", id, owner.getFirstName(), accountNumber, accountType);
    }
}


