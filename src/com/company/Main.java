package com.company;

import com.company.resource.CurrencyResource;

public class Main {
    /**
     * proyekt diger valyutalardan Azerbaycan manatina cevirme ucun nezerde tutulub
     * dollardan avroya cevirme yoxdur bunun ucun elave api yazilmalidi
     * isteseniz ozunuz yoxluya bilersiz
     * @param args
     */

    public static void main(String[] args) {
        CurrencyResource currencyResource = new CurrencyResource();
        currencyResource.userController();
    }
}
