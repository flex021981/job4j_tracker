package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();

        Student student = freshman; // Восходящее перебразование  Freshman к Student

        Object objFreshman = new Freshman(); // Восходящее перебразование Freshman к Object
        Object objStudent = new Student(); // Восходящее перебразование Student к Object

        Student studentFromObj = (Student) objStudent; //Нисходящее переобразование Object к Student
        Freshman freshmanFromObj = (Freshman) objFreshman; //Нисходящее переобразование Object к Freshman

        Freshman freshmanFromStudent = (Freshman) student; //Нисходящее переобразование Student к Freshman
    }

}
