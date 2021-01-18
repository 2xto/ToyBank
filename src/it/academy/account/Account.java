package it.academy.account;

import it.academy.exceptions.NoSuchAmountException;

import java.math.BigDecimal;

public interface Account {

    // add any methods you thing are applicable to Account here

    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount) throws NoSuchAmountException;
    void applyPercentage(BigDecimal percents);
    BigDecimal getAmount();

}
