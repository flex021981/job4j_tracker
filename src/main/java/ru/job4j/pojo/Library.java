package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bookOne = new Book("Clean code", 256);
        Book bookTwo = new Book("Alphabet", 26);
        Book bookThree = new Book("Алфавит", 33);
        Book bookFour = new Book("Learn Java", 1024);
        Book bookTemp = new Book();

        Book[] arrBooks = new Book[4];
        arrBooks[0] = bookOne;
        arrBooks[1] = bookTwo;
        arrBooks[2] = bookThree;
        arrBooks[3] = bookFour;

        for (int i = 0; i < arrBooks.length; i++) {
            System.out.println(arrBooks[i].toString() + " Индекс - " + i);
        }

        System.out.println();
        bookTemp = arrBooks[0];
        arrBooks[0] = arrBooks[3];
        arrBooks[3] = bookTemp;
        for (Book book : arrBooks) {
            System.out.println(book.toString());
        }

        System.out.println();
        for (Book book : arrBooks) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.toString());
            }
        }

    }
}
