package com.company.service.impl;

import com.company.dto.ExchangeOperationsRequest;
import com.company.dto.ExchangeOperationsResponse;
import com.company.service.ExchangeOperationService;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.company.constants.Common.AZN_CODE;

public class ExchangeOperationServiceImpl implements ExchangeOperationService {

    // emelyyati evvelce teyin edirik eger aznden basqa valyutaya cebiririkse bunu vururq
    // eger basqa valyutadan azn e cevirirkse o zaman boluruk
    @Override
    public ExchangeOperationsResponse exchange(ExchangeOperationsRequest operationsRequest) {
        ExchangeOperationsResponse response = new ExchangeOperationsResponse();
        response.setOperationTime(LocalDateTime.now());
        response.setOperationUniqueCode(UUID.randomUUID().toString());
        response.setFromCurrency(operationsRequest.getFromCurrency());
        response.setToCurrency(operationsRequest.getToCurrency());
        response.setFromAmount(operationsRequest.getAmount());
        if (operationsRequest.getToCurrency().equals(AZN_CODE)) {
            response.setToAmount(operationsRequest.getAmount() * operationsRequest.getValue());
        } else {
            response.setToAmount(operationsRequest.getAmount() / operationsRequest.getValue());
        }
        return response;
    }
}
