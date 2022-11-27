package com.example.myapplication;

import java.util.Scanner;

public class App {

    public static Simcard createSim(){
        int randomOperator = 1 + (int)(Math.random() * 3);
        int randomX = 1000000 + (int)(Math.random()* 9999999);
        String randomNumber = String.valueOf(randomX);
        int randomBalance = 0 + (int)(Math.random() * 10);
        if(randomOperator == 1){
            return new A1Card(randomBalance, randomNumber);
        } else if (randomOperator == 2) {
            return new MTSCard(randomBalance, randomNumber);
        }
        else{return new LifeCard(randomBalance, randomNumber);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int arraySize = 1 + (int) (Math.random() *10 );
        Simcard[] simCards = new Simcard[arraySize];
        for (int i=0; i<arraySize; i++){
            simCards[i] = createSim();
            System.out.println("Симка №" + i);
            System.out.println("Номер:" + simCards[i].getNumber());
            System.out.println("Баланс: " + simCards[i].getBalance());
            System.out.println("Оператор: " + simCards[i].getOperatorName());
            System.out.println("");
        }
        Phone myPhone = new Phone(createSim());
        myPhone.printNumber();

        for (int i=0; i<arraySize;i+=2){
            myPhone.makeCall(simCards[i].getNumber());
            myPhone.printBalance();
        }

        for (int i=1; i<arraySize; i+=2){
            myPhone.insertNewSim(simCards[i]);
            System.out.println("Номер, с которого звонят:");
            String numberFrom = in.nextLine();
            myPhone.recieveCall(numberFrom);
            myPhone.printBalance();
        }
    }

}
