package com.company.service;

import com.company.dto.CurrencyResponse;

import java.util.List;

public interface CurrencyService {

    List<CurrencyResponse> getAllCurrencies();

    CurrencyResponse getCurrencyByCode(String code);
}
