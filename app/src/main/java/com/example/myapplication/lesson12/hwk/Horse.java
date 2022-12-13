package com.example.myapplication.lesson12.hwk;

public class Horse extends Pet{

    private int herdNumber;

    public Horse(String name, String bread, int herdNumber){
        super(name,bread);
        this.herdNumber = herdNumber;
    }
    public String Info(){
        return "Кличка " + this.getName() + " Порода " + this.getBread() + " Возраст " + this.herdNumber;
    }
}

