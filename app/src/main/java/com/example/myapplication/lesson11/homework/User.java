package com.example.myapplication.lesson11.homework;

import java.util.LinkedList;
import java.util.Queue;

public class User {
    private String nickname;
    private Queue<Message> queueOfMessages;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User(String nickname){
        this.nickname = nickname;
        this.queueOfMessages = new LinkedList();
    }

    public void addMessage(Message message){
       queueOfMessages.offer(message);
    }
    public Message getMessage(){
        return queueOfMessages.poll();
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
