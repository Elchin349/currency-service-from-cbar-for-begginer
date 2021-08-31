package com.company.model;

import java.time.LocalDate;

public class CurrencyModel {
    private long id;
    private String valuteCode;
    private String nominal;
    private String name;
    private double value;
    private LocalDate createDate;

    public CurrencyModel() {
        this.createDate = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "CurrencyRecord{" +
                "id=" + id +
                ", valuteCode='" + valuteCode + '\'' +
                ", nominal='" + nominal + '\'' +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", createDate=" + createDate +
                '}';
    }
}
