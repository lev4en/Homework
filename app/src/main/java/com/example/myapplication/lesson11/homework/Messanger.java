package com.example.myapplication.lesson11.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Messanger {
    private static List<User> users = new LinkedList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1- Добавить пользователя");
            System.out.println("2- Просмотреть всех пользователей");
            System.out.println("3- Отправить сообщение пользователю");
            System.out.println("4- Прочитать сообщение");
            System.out.println("Прочее - выход");
            String str = sc.nextLine();

            int index;


            try {
                index = Integer.parseInt(str);
            } catch (Exception e){
                return;
            }

            switch (index) {
                case (1): {
                    System.out.println("Введите имя пользователя");
                    String name = sc.nextLine();
                    users.add(new User(name));
                    break;
                }
                case (2): {
                    for (User user : users) {
                        System.out.println(user.toString());
                    }
                    break;
                }
                case (3): {
                    System.out.println("Введите пользователя");
                    String name = sc.nextLine();
                    User user = returnUser(name);
                    if(user !=  null) {
                        System.out.println("Напишите сообщение");
                        String msg = sc.nextLine();
                        user.addMessage(new Message(msg));
                    } else {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case(4): {
                    System.out.println("Введите пользователя");
                    String name = sc.nextLine();
                    User user = returnUser(name);
                    if(user !=  null) {
                        Message message = user.getMessage();
                        if (message != null){
                            System.out.println("Сообщение:" + message.toString());

                        }else{
                            System.out.println("У пользователя нет сообщений");
                        }

                    } else {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }


                default:
                    return;
            }
        }
    }


    static User returnUser(String nickName) {
        for (User user : users) {
            if (user.getNickname().equals(nickName)) {
                return user;
            }
        }
        return null;
    }


}
