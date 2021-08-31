package com.company.dto;

public class ExchangeOperationsRequest {
    private String fromCurrency;
    private String toCurrency;
    private double amount;
    private double value; // meselen 1 dollar nece azndir bunu xml fayldan merkezi bannkdan getirib bura initialize edirik

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
