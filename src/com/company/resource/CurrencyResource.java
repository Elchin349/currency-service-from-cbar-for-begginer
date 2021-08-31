package com.company.resource;

import com.company.dto.CurrencyResponse;
import com.company.service.CurrencyService;
import com.company.service.impl.CurrencyServiceImpl;

import java.util.Scanner;

import static com.company.constants.Common.*;
import static com.company.util.MenuDesignUtils.menuDesign;
import static com.company.util.MenuDesignUtils.menuDesignV2;

public class CurrencyResource {
    private final Scanner sc = new Scanner(System.in);
    private final CurrencyService currencyService;
    private final OperationResource operationResource;

    public CurrencyResource() {
        currencyService = new CurrencyServiceImpl();
        operationResource = new OperationResource();
    }

    private void menu() {
        System.out.println("\n");
        System.out.println(MENU);
        System.out.println(menuDesign(SHOW_ALL_CURRENCY,FIRST) );
        System.out.println(menuDesign(FIND_CURRENCY_BY_CODE,SECOND) );
        System.out.println(menuDesign(EXCHANGE_OPERATION,THIRD));
    }

    private String inputUserChoice() {
        System.out.println();
        System.out.print("Select - - >");
        String select = sc.next().trim();
        System.out.println();
        return select;
    }

    public void userController() {
        menu();
        checkSelection(inputUserChoice());
        userController();
    }

    private void checkSelection(String select) {
        switch (select) {
            case SELECT_SHOW_ALL_CURRENCY -> currencyService.getAllCurrencies().forEach(this::printCurrency);
            case SELECT_FIND_CURRENCY_BY_CODE -> printCurrency(currencyService.getCurrencyByCode(insertCurrencyCode()));
            case SELECT_EXCHANGE_OPERATION -> operationResource.operationMenu();
        }
    }

    private String insertCurrencyCode() {
        System.out.println("Enter currency code");
        return sc.next();
    }

    private void printCurrency(CurrencyResponse response) {
        System.out.println(menuDesignV2(CODE + " " + response.getValuteCode()));
        System.out.println(menuDesignV2(NOMINAL + " " + response.getNominal()));
        System.out.println(menuDesignV2(NAME + " " + response.getName()));
        System.out.println(menuDesignV2(VALUE + " " + response.getValue()));
        System.out.println(menuDesignV2(CREATE_DATE + " " + response.getCreateDate()));
        System.out.println("=".repeat(30));
    }

}
