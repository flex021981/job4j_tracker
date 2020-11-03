package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();

        // Восходящее перебразование  Freshman к Student
        Student student = freshman;

        // Восходящее перебразование Freshman к Object
        Object objFreshman = new Freshman();
        // Восходящее перебразование Student к Object
        Object objStudent = new Student();

        //Нисходящее переобразование Object к Student
        Student studentFromObj = (Student) objStudent;
        //Нисходящее переобразование Object к Freshman
        Freshman freshmanFromObj = (Freshman) objFreshman;

        //Нисходящее переобразование Student к Freshman
        Freshman freshmanFromStudent = (Freshman) student;
    }
}
