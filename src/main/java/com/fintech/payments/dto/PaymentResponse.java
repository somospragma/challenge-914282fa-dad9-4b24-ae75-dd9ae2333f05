package com.fintech.payments.dto;

public class PaymentResponse {

    private String transactionId;
    private double amount;

    public PaymentResponse(String transactionId, double amount) {
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