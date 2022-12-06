package com.example.myapplication.lesson10;

import java.util.Scanner;

public class Doc {
    private static final String DOC_PATTERN = "\\d{4}-[A-z]{3}-\\d{4}-[A-z]{3}-\\d[A-z]\\d[A-z]";

    public static void main(String[] args) {
        getdData();
    }

    public static void getdData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер документа в формате:  xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.");
        String docName = in.nextLine();
        while (true) {
            if (docName.matches(DOC_PATTERN)) {
                break;
            } else {
                System.out.println("Ошибка ввода");
                System.out.println("Введите номер документа в формате:  xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.");
                docName = in.nextLine();
            }
        }
        System.out.println("Номер Вашего документа: " + docName);
        Hw.outputFirstTwoNumberBlock(docName);
        Hw.outputDocumentNumberWithoutLetters(docName);
        Hw.outputDocumentLetters(docName);
        Hw.checkingFogMatchingABC(docName);
        Hw.checkingToEnding1a2b(docName);

    }


}
