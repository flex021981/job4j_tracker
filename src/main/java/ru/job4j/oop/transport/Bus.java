package ru.job4j.oop.transport;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Я еду по дороге!!!");
    }
}
