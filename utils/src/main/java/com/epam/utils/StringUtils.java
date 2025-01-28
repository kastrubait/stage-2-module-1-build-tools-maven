package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try{
            return (NumberUtils.toDouble(str) > 0.0 && str.charAt(0) != '0');        }
        catch (Exception e){
            return false;
        }

        //code!
    }

    public static void
    main(String[] args) {
        System.out.println(isPositiveNumber("34435"));
    }
}
