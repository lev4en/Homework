package lesson9.practice;

import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args){
        try(FileReader fr = new FileReader("C:\\Users\\ret6erdtyter\\Desktop\\ошибка.txt")){
            char[] array = new char[10];
            fr.read(array);
            for (char c : array)
                System.out.println(c);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
