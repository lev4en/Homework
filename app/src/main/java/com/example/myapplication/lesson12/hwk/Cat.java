package com.example.myapplication.lesson12.hwk;

public class Cat extends Pet {
    private int age;

    public Cat(String name, String bread, int age){
        super(name,bread);
        this.age = age;
    }
public String Info(){
        return "Кличка " + this.getName() + " Порода " + this.getBread() + " Возраст " + this.age;
}
}
