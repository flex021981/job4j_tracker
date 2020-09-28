package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("имя котика - " + name + ", и что он ел - " + food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Barsik");
        gav.eat("kotleta");
        gav.show();

        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Чернышь");
        black.eat("fish");
        black.show();
    }
}
