package com.company.util;


import static com.company.constants.Common.LENGTH_FOR_SPACE;

public class MenuDesignUtils {

    private static int verifyLen(int strLen) {
        return LENGTH_FOR_SPACE - strLen;
    }

    private static String space(int len){
        String space = "-";
        return space.repeat(len);
    }

    public static String menuDesign(String str,String index){
        return str + space(verifyLen(str.length())) + index;
    }
    public static String menuDesignV2(String str){
        return str + space(verifyLen(str.length()));
    }
}
