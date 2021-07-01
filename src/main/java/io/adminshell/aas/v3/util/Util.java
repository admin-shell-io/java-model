package io.adminshell.aas.v3.util;

import java.util.ArrayList;
import java.util.Arrays;

public class Util {

    public static <T> ArrayList<T> asList(T... elements) {
        return new ArrayList<T>(Arrays.asList(elements));
    }

}