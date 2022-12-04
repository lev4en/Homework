package com.example.myapplication;

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int a = in.nextInt();

        printInConsole(a);

    }

    static void printInConsole(int a) {
        switch (a) {
            case 1:
                System.out.println("это 1");
                break;
            case 2:
                System.out.println("это 2");
                break;
            default:
                System.out.println("я не знаю это число");
        }
    }
}
