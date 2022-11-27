package com.example.myapplication;

public class Simcard {
    private int balance;
    private String number;

    protected Simcard(int balance, String number) {
        this.balance = balance;
        this.number = number;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return this.number;
    }

    public String getOperatorName() {
        return null;
    }

    public void makeCall(String number2) {
        if (this.getBalance()<=0) {
            System.out.println("Звонок запрещен.");
        } else {
            System.out.println("Звоню на номер " + number2);
        }
    }

    public void recieveCall(String numberFrom) {
        System.out.println("Принимаю звонок м номера " + numberFrom);
    }
}
