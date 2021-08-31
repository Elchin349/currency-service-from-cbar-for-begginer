package com.company.dto;

import java.time.LocalDate;

public class CurrencyResponse {
    private String valuteCode;
    private String nominal;
    private String name;
    private Double value;
    private LocalDate createDate;

    public String getValuteCode() {
        return valuteCode;
    }

    public void setValuteCode(String valuteCode) {
        this.valuteCode = valuteCode;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
