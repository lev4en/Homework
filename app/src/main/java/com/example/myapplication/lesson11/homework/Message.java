package com.example.myapplication.lesson11.homework;

public class Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                '}';
    }
}
