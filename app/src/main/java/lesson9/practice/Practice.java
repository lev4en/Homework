package lesson9.practice;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String[] array = new String[8];
        try {
            System.out.println(array[9]);
        } catch (StackOverflowError e) {
            System.out.println("Файл не найден");
        } catch (IndexOutOfBoundsException d) {
            System.out.println("Размер массива не соответствует");

        } finally {
            System.out.println("Программа завершена");


        }
    }
}

