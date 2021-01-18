package it.academy.bank;

import it.academy.account.Account;
import it.academy.exceptions.NoSuchAccountException;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankId;
    private String bankName;
    private List<Account> accounts;

    public Bank(String bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){

    }

    public Account getAccount(String accountId) throws NoSuchAccountException {
        return null;
    }
}
