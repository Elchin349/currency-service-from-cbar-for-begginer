package com.company.service.impl;

import com.company.dto.CurrencyResponse;
import com.company.mapper.CurrencyMapper;
import com.company.service.CurrencyService;
import com.company.service.XmlFileCurrencyService;

import java.util.List;

public class CurrencyServiceImpl implements CurrencyService {

    private final XmlFileCurrencyService xmlFileCurrencyService;

    public CurrencyServiceImpl() {
        this.xmlFileCurrencyService = new XmlFileCurrencyServiceImpl();
    }

    @Override
    public List<CurrencyResponse> getAllCurrencies() {
        return CurrencyMapper.INSTANCE.toResponseList(xmlFileCurrencyService.fetchXmlFileCurrency());
    }

    @Override
    public CurrencyResponse getCurrencyByCode(String code) {
        return CurrencyMapper.INSTANCE.toResponse(xmlFileCurrencyService.fetchXmlFileCurrency()
                .stream()
                .filter(record -> record.getValuteCode().equals(code))
                .findFirst().get());
    }




}
