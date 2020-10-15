package ru.job4j.oop.transport;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Я еду по рельсам!!!");
    }
}
