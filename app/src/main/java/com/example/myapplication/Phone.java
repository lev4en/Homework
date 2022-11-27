package com.example.myapplication;

public class Phone {
    private Simcard sim;


    public Phone(Simcard sim){
        this.sim = sim;
    }

    public void insertNewSim(Simcard newSim){
        this.sim = newSim;
        System.out.println("Вставлена новая сим карта. Ваш номер телефона: " + this.sim.getNumber() + ". Ваш баланс: " + this.sim.getBalance() + ". Ваш оператор: " + this.sim.getOperatorName());
    }
    public void makeCall(String number2){
        this.sim.makeCall(number2);
    }
    public void recieveCall(String numberFrom){
        this.sim.recieveCall(numberFrom);
    }
    public void printBalance(){
        System.out.println("Ваш баланс: " + this.sim.getBalance());
    }

    public void printNumber(){
        System.out.println("Номер телефона: " + this.sim.getNumber());
    }
}
