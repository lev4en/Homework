package lesson9.practice;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        registration();
    }

    static boolean correct(String data) {
        boolean check;
        String testWord = "[A-Za-z\\d_]{1,20}";
        if (data.matches(testWord)) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    static void receptionLoginAndPassword(String login, String password, String correctPassword) throws WrongLoginException, WrongPasswordException {
        if (correct(login)) {
            System.out.println("Логин принят");
        } else {
            throw new WrongLoginException("Некорректный логин");
        }
        if (correct(password)) {
        } else {
            throw new WrongPasswordException("Некорректный пароль");
        }
        if (correctPassword.equals(password)) {
            System.out.println("Пароль принят");
        } else {
            System.out.println("Пароли не совпадают");
        }
    }

    static void registration() throws WrongLoginException, WrongPasswordException {
        try{
        Scanner in = new Scanner(System.in);
        System.out.println("Логин должен содержать только латинские буквы, цифры и знак подчеркивания.Длинна должна быть не более 20 символов.");
        String login = in.nextLine();

        System.out.println("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания.Длинна должна быть не более 20 символов.");
        String password = in.nextLine();

        System.out.println("Подтвердите пароль");
        String correctPassword = in.nextLine();

        receptionLoginAndPassword(login, password, correctPassword);
    } catch (WrongLoginException errorLogin){
        System.out.println("Некорректный логин");
    }catch(WrongPasswordException errorPassword){
        System.out.println("Некорректный пароль");
    }


    }
}
