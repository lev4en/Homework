package lesson9.practice;

import java.util.Scanner;

public class First {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        method();
    }

    static void method() throws WrongLoginException, WrongPasswordException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Логин должен содержать только латинские буквы, цифры и знак подчеркивания.Длинна пароля должна быть не более 20 символов.");
            String login = in.nextLine();
            checkLogin(login);
            System.out.println("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания.Длинна пароля должна быть не более 20 символов");
            String password = in.nextLine();
            checkPassword(password);
            String corectPassword = in.nextLine();
            matchPassword(password, corectPassword);
        } catch (WrongPasswordException | WrongLoginException error) {
            System.out.println("Ошибка ввода");
        }
    }

    static void checkLogin(String verificationLogin) throws WrongLoginException {
        if (verificationLogin.matches("[A-Za-z\\d_]{1,20}")) {
            System.out.println("Логин принят");
        } else {
            throw new WrongLoginException("Некоректно введен логин");
        }
    }

    static void checkPassword(String verificationPassword) throws WrongPasswordException {
        if (verificationPassword.matches("[A-Za-z\\d_]{1,20}")) {
            System.out.println("Введите пароль еще раз.");
        } else {
            throw new WrongPasswordException("Некоректно введен пароль.");
        }
    }

    static void matchPassword(String mathPassword, String password) {
        if (mathPassword.equals(password)) {
            System.out.println("Пароль принят");
        } else {
            System.out.println("Пароли не совпадают");
        }
    }
}
