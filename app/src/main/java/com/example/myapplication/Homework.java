package com.example.myapplication;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки на четность");
        int a = in.nextInt();
        Zadanie_1(a);

        System.out.println("Выведем самое маленькое число по модулю");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        Zadanie_2(x, y, z);

        System.out.println("Ввести целое число от 1 до 7");
        int v = in.nextInt();
        Zadanie_3(v);

        Zadanie_4();

    }

    static void Zadanie_1(int a) {
        int x = a % 2;
        if (x == 0) {
            System.out.println("Это число четное");
        } else {
            System.out.println("Это число нечетное");
        }
    }

    static void Zadanie_2(int x, int y, int z) {
        int xx = x < 0 ? x * -1 : x;
        int yy = y < 0 ? y * -1 : y;
        int zz = z < 0 ? z * -1 : z;
        if (xx < yy & xx < zz) {
            System.out.println(xx);
        } else if (yy < xx & yy < zz) {
            System.out.println(yy);
        } else if (zz < xx & zz < yy)
            System.out.println(zz);
    }

    static void Zadanie_3(int v) {
        switch (v) {
            case 1:
                System.out.println("это понедельник-бездельник");
                break;
            case 2:
                System.out.println("вторник-повторник");
                break;
            case 3:
                System.out.println("это среда");
                break;
            case 4:
                System.out.println("четверг-всю раблоту я отверг");
                break;
            case 5:
                System.out.println("это пятница-пьяница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("я не знаю этот день");
        }
    }

    static void Zadanie_4() {
        for (int r = 5; r <= 100; r = r + 5) {
            if (r != 0) {
                System.out.println(r);
            }
        }
    }

}
