package lesson9.practice;

public class Maker {
    public static void throwOne() throws IndexOutOfBoundsException{
        System.out.println("внутри throwOne");
        throw new IndexOutOfBoundsException("Ошибка такая-то");
        }
    }

