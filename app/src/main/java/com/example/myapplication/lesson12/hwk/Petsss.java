package com.example.myapplication.lesson12.hwk;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Petsss {
    private static HashMap<String, Pet> petsss = new HashMap<>();

    public static void main(String[] args) {
        createPet();
        printPetInfo();
        deletePet();
    }


    private static void createPet() {
        Pet dymok = new Cat("Dymok", "british", 2);
        Pet sharik = new Dog("Sharik", "metis", 15);
        Pet pyatnishko = new Horse("Pyatnishko", "hzhorse", 12);
        Pet muhtar = new Dog("Muhtar", "terer", 11);
        Pet gav = new Dog("Gav", "spaniel", 9);

        petsss.put(dymok.getName(), dymok);
        petsss.put(sharik.getName(), sharik);
        petsss.put(pyatnishko.getName(), pyatnishko);
        petsss.put(muhtar.getName(), muhtar);
        petsss.put(gav.getName(), gav);
    }

    private static void printPetInfo() {
        for (Pet pet : petsss.values()) {
            System.out.println(pet.petinfo());
        }
    }

    private static void deletePet() {
        Scanner in = new Scanner(System.in);
        while (!petsss.isEmpty()) {
            System.out.println("Животное которое хотите удалить");
            String deletePetName = in.nextLine();
            Set<String> listPetsss = petsss.keySet();
            if (deletePetName.equals("")) {
                System.out.println("Все!");
                break;
            }else{
                if (petsss.containsKey(deletePetName)) {
                    petsss.remove(deletePetName);
                    System.out.println("Удалили, остались :");
                    printPetInfo();
                } else {
                    System.out.println("Некорректный ввод. Повторите операцию");
                    continue;
                }
            }
        }
    }
}
