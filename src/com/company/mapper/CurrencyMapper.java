package com.company.mapper;

import com.company.dto.CurrencyResponse;
import com.company.model.CurrencyModel;

import java.util.List;
import java.util.stream.Collectors;

public class CurrencyMapper {

    public final static CurrencyMapper INSTANCE = new CurrencyMapper();

    public CurrencyResponse toResponse(CurrencyModel record) {
        CurrencyResponse response = new CurrencyResponse();
        response.setName(record.getName());
        response.setNominal(record.getNominal());
        response.setValuteCode(record.getValuteCode());
        response.setValue(record.getValue());
        response.setCreateDate(record.getCreateDate());
        return response;
    }

    public List<CurrencyResponse> toResponseList(List<CurrencyModel> records) {
        return records
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
}
