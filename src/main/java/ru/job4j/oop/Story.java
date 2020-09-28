package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        /*Пионер Петя и красная шапочка*/
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);

        /*Колобок*/
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf1 = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf1.tryEat(ball);
        fox.tryEat(ball);
    }
}
