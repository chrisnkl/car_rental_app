package com.chrisnkl.backend.common;

import java.util.UUID;

public class StringsLib {

    public static boolean isValid(UUID input) {
        return input != null;
    }

    public static boolean isValid(String input) {
        return input != null && input.isBlank();
    }

}
