package it.academy.data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    // consider using Amount before and after transaction

    private final String action;
    private final BigDecimal amount;
    private final LocalDateTime localDateTime;

    public Transaction(String action, BigDecimal amount, LocalDateTime localDateTime){
        this.action = action;
        this.amount = amount;
        this.localDateTime = localDateTime;
    }

    public String getAction() {
        return action;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
