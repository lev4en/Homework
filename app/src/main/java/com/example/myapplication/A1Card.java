package com.example.myapplication;

public final class A1Card extends Simcard {



    public A1Card(int balance, String number) {
        super(balance, "33" + number);
    }

    @Override
    public String getOperatorName() {
        return "A1";
    }

    @Override
    public void makeCall(String number2) {

        int cost = (number2.startsWith("33")) ? 1 : 3;
        System.out.println("Звоню на номер " + number2);
        if (this.getBalance() < cost) {
            System.out.println("Звонок запрещен.");
        } else {
            System.out.println("С баланса снято " + cost);
            this.setBalance(this.getBalance() - cost);
        }
    }
    @Override
    public void recieveCall(String numberFrom) {
        System.out.println("Принимаю звонок м номера " + numberFrom);
        int cost = (numberFrom.startsWith("33"))  ? 0 : 1;
        this.setBalance(this.getBalance()-cost);
    }

}
