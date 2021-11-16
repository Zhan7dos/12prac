package com.company;
public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    public void makeJump() {
        System.out.println("Я прыгаю");
    }

    public void makeVoice() {
        System.out.println("Bow-wow !");
    }

    public void makeRun() {
        System.out.println("Бегать...");
    }

    public void makeBite() {
        System.out.println("Кусать...");
    }
}
