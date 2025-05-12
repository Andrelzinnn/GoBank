package dev.gobank.handler;

import dev.gobank.account.Account;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class TransactionHistoryHandler{
    private final Map<String, List<String>> transactionHistory = new HashMap<>();

    public boolean addNewTransaction(Account holder, Account target, Double amount, String type, Date date) {
        String holderCpf = holder.getOwner().getCpf();
        String formatted = String.format(
                "Holder: %s%nTarget: %s%nAmount: %.2f%nType: %s%nDate: %s%n",
                getNameAndLastName(holder),
                getNameAndLastName(target),
                amount,
                type,
                date.toString()
        );

        transactionHistory.computeIfAbsent(holderCpf, k -> new ArrayList<>()).add(formatted);
        return true;
    }

    public String getNameAndLastName(Account account) {
        return String.format("%s %s", account.getOwner().getFirstName(), account.getOwner().getLastName());
    }
}
