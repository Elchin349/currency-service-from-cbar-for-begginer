package com.company.service;

import com.company.dto.ExchangeOperationsRequest;
import com.company.dto.ExchangeOperationsResponse;

public interface ExchangeOperationService {

    ExchangeOperationsResponse exchange(ExchangeOperationsRequest operationsRequest);
}
