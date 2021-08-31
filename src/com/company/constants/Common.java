package com.company.constants;

import static com.company.util.DateGenerate.generateDate;

public class Common {
    // XML Constants Values
    public static final String VALUTE = "Valute";
    public static final String CODE = "Code";
    public static final String NOMINAL = "Nominal";
    public static final String NAME = "Name";
    public static final String VALUE = "Value";
    public static final String XML_CBAR_URL = String.format("https://www.cbar.az/currencies/%s.xml", generateDate());


    // MENU Design
    public final static int LENGTH_FOR_SPACE = 50;
    public final static String SHOW_ALL_CURRENCY = "Show All Currencies ";
    public final static String FIND_CURRENCY_BY_CODE = "Find Currency By Code ";
    public final static String EXCHANGE_OPERATION = "Exchange Operation ";
    public final static String EXIT = "EXIT ";
    public final static String MENU = "     * * * * * * * * * MENU * * * * * * * * *";
    public final static String FIRST = "1";
    public final static String SECOND = "2";
    public final static String THIRD = "3";
    public final static String FOURTH = "4";
    public final static String FIFTH = "5";

    // currency code
    public final static String AZN_CODE = "AZN";

    // selection
    public static final String SELECT_SHOW_ALL_CURRENCY = "1";
    public static final String SELECT_FIND_CURRENCY_BY_CODE = "2";
    public static final String SELECT_EXCHANGE_OPERATION = "3";


    // response design
    public static final String OPERATION_CODE = "Operation Code: ";
    public static final String FROM_CURRENCY = "From Currency: ";
    public static final String TO_CURRENCY = "To Currency: ";
    public static final String FROM_AMOUNT = "From Amount: ";
    public static final String TO_AMOUNT = "To Amount: ";
    public static final String OPERATION_TIME = "Operation Time: ";
    public final static String CREATE_DATE = "Create Date";
}
