package it.academy.account;

import it.academy.exceptions.NoSuchAmountException;

import java.math.BigDecimal;

public class CreditAccount extends BasicAccount{
    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) throws NoSuchAmountException {

    }

    @Override
    public void applyPercentage(BigDecimal percents) {

    }

    @Override
    public BigDecimal getAmount() {
        return null;
    }
}
