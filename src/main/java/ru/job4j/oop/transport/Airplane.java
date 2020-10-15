package ru.job4j.oop.transport;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Я летаю в небе!!!!");
    }
}
