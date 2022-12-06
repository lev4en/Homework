package com.example.myapplication.lesson10;

import static android.provider.Settings.System.getString;

import java.util.Scanner;


public class Practice10 {
    public static void main(String[] args) {

        getString("i like java!");


    }

    public static void getString(String str) {
        System.out.println(str.charAt(12));
        System.out.println(str.endsWith("!!!"));
        System.out.println("I like");



    }

}
