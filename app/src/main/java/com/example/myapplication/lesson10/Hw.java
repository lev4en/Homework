package com.example.myapplication.lesson10;

import java.util.Locale;

public class Hw {
    public static void outputFirstTwoNumberBlock(String numberBlock) {
        System.out.println("Первые два блока цифр номера: " + numberBlock.substring(0, 4) + " " + numberBlock.substring(9, 13));
    }

    public static void outputDocumentNumberWithoutLetters(String nameWithoutLetters) {
        System.out.println("Номер с заменёнными буквами на *: " + nameWithoutLetters.replaceAll("[A-z]", "*"));
    }

    public static void outputDocumentLetters(String inputName) {
        String upperName = inputName.toUpperCase(Locale.ROOT);
        StringBuilder onlyLetters = new StringBuilder();
        onlyLetters.append(upperName.substring(5, 8)).append("/").append(upperName.substring(14, 17)).append("/").append(upperName.charAt(19)).append("/").append(upperName.charAt(21));
        System.out.println("Буквы в верхнем регистре: " + onlyLetters);
    }

    public static void checkingFogMatchingABC(String abcMatching) {
        if (abcMatching.toLowerCase(Locale.ROOT).regionMatches(5, "abc", 0, 3) || abcMatching.toLowerCase(Locale.ROOT).regionMatches(14, "abc", 0, 3)) {
            System.out.println("Номер документа содержит последовательность \"abc\"");
        } else {
            System.out.println("номер документа не содержит последовательность \"abc\"");
        }
    }

    public static void checkingToEnding1a2b(String ending) {
        if (ending.endsWith("1a2b")) {
            System.out.println("Номер документа заканчивается на 1a2b");
        } else {
            System.out.println("Номер документа не заканчивается на 1a2b");
        }
    }
}


