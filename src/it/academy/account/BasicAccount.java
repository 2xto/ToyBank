package it.academy.account;

import it.academy.data.Transaction;

import java.math.BigDecimal;
import java.util.List;

public abstract class BasicAccount implements Account {
    protected String id;
    protected BigDecimal balance;
    protected List<Transaction> transactions;
}
