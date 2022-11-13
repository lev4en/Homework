package com.example.myapplication;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки на четность");
        int a = in.nextInt();
        Zadanie_1(a);
    }
    static void Zadanie_1(int a){
        int x= a % 2;
        if (x ==  0) {
            System.out.println("Это число четное");
        }
        else{
            System.out.println("Это число нечетное");
        }
    }
}
