package com.company.dto;

import java.time.LocalDateTime;

public class ExchangeOperationsResponse {
    private String operationUniqueCode;
    private String fromCurrency;
    private String toCurrency;
    private Double fromAmount;
    private Double toAmount;
    private LocalDateTime operationTime;

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;

    }

    public String getOperationUniqueCode() {
        return operationUniqueCode;
    }

    public void setOperationUniqueCode(String operationUniqueCode) {
        this.operationUniqueCode = operationUniqueCode;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public Double getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Double fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Double getToAmount() {
        return toAmount;
    }

    public void setToAmount(Double toAmount) {
        this.toAmount = toAmount;
    }

    public LocalDateTime getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(LocalDateTime operationTime) {
        this.operationTime = operationTime;
    }
}
