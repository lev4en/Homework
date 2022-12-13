package com.example.myapplication.lesson12.hwk;

public class Dog extends Pet{
    private int weight;

    public Dog(String name, String bread, int weight){
        super(name,bread);
        this.weight = weight;
    }
    public String Info(){
        return "Кличка " + this.getName() + " Порода " + this.getBread() + " Возраст " + this.weight;
    }
}

