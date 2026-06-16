package com.fintech.payments.dto;

public class PaymentRequest {

    private String transactionId;
    private double amount;

    public PaymentRequest(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }
}