package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int matches = 11;
        boolean gamers = true;
        while (run) {
            if (gamers) {
                System.out.println("Игрок номер 1 введите число:");
                gamers = false;
            } else {
                System.out.println("Игрок номер 2 введите число:");
                gamers = true;
            }
            int select = Integer.valueOf(input.nextLine());
            if ((select >= 1) && (select <= 3)) {
                matches = matches - select;
            } else {
                System.out.println("Не верное колличество спичек!!");
            }
            if (matches > 0) {
                System.out.println("Осталось " + matches + " спичек.");
            } else {
                if (!gamers) {
                    System.out.println("Игра оконченна!!! Выиграл игрок номер один.");
                } else {
                    System.out.println("Игра оконченна!!! Выиграл игрок номер два.");
                }
                run = false;
            }
        }
    }
}
