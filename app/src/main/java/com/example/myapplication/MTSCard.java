package com.example.myapplication;


public final class MTSCard extends Simcard {


    public MTSCard(int balance, String number) {
        super(balance, "29" + number);
    }

    @Override
    public String getOperatorName() {
        return "MTS";
    }

    @Override
    public void makeCall(String number2) {

        int cost = (number2.startsWith("29")) ? 1 : 3;
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
        int cost = (numberFrom.startsWith("29"))  ? 0 : 1;
        this.setBalance(this.getBalance()-cost);
    }

}
