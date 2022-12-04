package lesson9.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args){
        int[] array = new int[8];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        try{
            System.out.println(array[in.nextInt()]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Размер массива не соответствует");
        }catch (InputMismatchException b){
            System.out.println("Неверный тип ввода");

        }finally {
            System.out.println("Программа завершена");
        }

    }
}
