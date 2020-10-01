package ru.job4j.inheritance;

public class Doctor extends Profession {
    private Diagnosis diagnosis;
    private Pacient pacient;

    public Diagnosis heal(Pacient pacient) {
        return diagnosis;
    }
}

class Diagnosis {
    private String name;

    public String getName() {
        return name;
    }
}

class Pacient {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}