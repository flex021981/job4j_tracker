package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student studentIvan = new Student();
        studentIvan.setName("Ivan");
        studentIvan.setSurname("Ivanov");
        studentIvan.setGroup("Math-03");
        studentIvan.setReceiptDate(new Date());
        System.out.println(
                "ФИО: " + studentIvan.getName() + " " + studentIvan.getSurname() + "\n" +
                        "Группа: " + studentIvan.getGroup() + "\n" +
                        "Дата поступления: " + studentIvan.getReceiptDate()
        );
    }
}
