package com.company.resource;

import com.company.dto.CurrencyResponse;
import com.company.dto.ExchangeOperationsRequest;
import com.company.dto.ExchangeOperationsResponse;
import com.company.service.CurrencyService;
import com.company.service.ExchangeOperationService;
import com.company.service.impl.CurrencyServiceImpl;
import com.company.service.impl.ExchangeOperationServiceImpl;

import java.util.Scanner;

import static com.company.constants.Common.*;

public class OperationResource {


    private final Scanner sc = new Scanner(System.in);
    private final ExchangeOperationService exchangeOperationService;
    private final CurrencyService currencyService;

    public OperationResource() {
        this.exchangeOperationService = new ExchangeOperationServiceImpl();
        this.currencyService = new CurrencyServiceImpl();
    }

    public void operationMenu() {
        ExchangeOperationsRequest request = new ExchangeOperationsRequest();
        System.out.println("Enter From Currency");
        request.setFromCurrency(sc.nextLine().trim().toUpperCase());
        System.out.println("Enter to Currency");
        request.setToCurrency(sc.nextLine().trim().toUpperCase());
        System.out.println("Enter amount");
        request.setAmount(sc.nextDouble());
        sc.nextLine();
        /**
         * proyekt nezerde tutuldugu kimi ya basqa valyutadan AZN e yada ki
         * AZN den basqa valyutaya cevirme ucundu
         * USD -> EUR ve ya YTL - > EUR ucun nezerde tutulmayib
         * buna gore if else ile yoxlayiriq ki
         * eger toCurrency AZN dirse yeni AZN e cevirilecekse o zaman fromCurrency yeni basqa valyuta nedise onu
         * merkezi bankdan cekib getiririk
         * cunki merkezi bankin bize vermis oldugu xml faylinda AZN yoxdur, AZN e gore satis qiymetleri var
         * bunun ucunde deyirikki eger musteri AZN -> USD dollara cevirmek istese o zaman else dusecek
         */
        CurrencyResponse currencyResponse;
        if (request.getToCurrency().equals(AZN_CODE)) {
            currencyResponse = currencyService.getCurrencyByCode(request.getFromCurrency());

        } else {
            currencyResponse = currencyService.getCurrencyByCode(request.getToCurrency());
        }
        request.setValue(currencyResponse.getValue());
        printResult(calculate(request));
    }

    private ExchangeOperationsResponse calculate(ExchangeOperationsRequest request) {
        return exchangeOperationService.exchange(request);
    }

    private void printResult(ExchangeOperationsResponse exchangeOperationsResponse) {
        System.out.println(OPERATION_CODE + exchangeOperationsResponse.getOperationUniqueCode());
        System.out.println(OPERATION_TIME + exchangeOperationsResponse.getOperationTime());
        System.out.println(FROM_CURRENCY + exchangeOperationsResponse.getFromCurrency());
        System.out.println(TO_CURRENCY + exchangeOperationsResponse.getToCurrency());
        System.out.println(FROM_AMOUNT + exchangeOperationsResponse.getFromAmount());
        System.out.println(TO_AMOUNT + exchangeOperationsResponse.getToAmount());
    }

}
