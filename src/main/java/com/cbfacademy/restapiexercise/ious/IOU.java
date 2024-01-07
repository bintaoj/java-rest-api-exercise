package com.cbfacademy.restapiexercise.ious;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class IOU {
    
    public final UUID ID;
    private String borrower;
    private String lender;
    private BigDecimal amount;
    private Instant dateTime;


    public IOU(String borrower, String lender, BigDecimal amount, Instant dateTime) {
        this.ID = UUID.randomUUID();
        this.borrower = borrower;
        this.lender = lender;
        this.amount = amount;
        this.dateTime = dateTime;
    }
    


    public String getRandomUUID() {
        // Convert UUID to string representation
        return ID.toString();
    }


    public String getBorrower() {
        return this.borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getLender() {
        return this.lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Instant getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

}