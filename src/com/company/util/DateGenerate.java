package com.company.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateGenerate {

    public static String generateDate(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
