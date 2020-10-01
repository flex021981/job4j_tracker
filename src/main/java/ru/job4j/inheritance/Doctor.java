package ru.job4j.inheritance;

public class Doctor extends Profession {
    Diagnosis diagnosis;
    Pacient pacient;
    public Diagnosis heal(Pacient pacient) {
        return diagnosis;
    }
}

class Diagnosis{
    String name;

    public String getName() {
        return name;
    }
}
class Pacient {
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    String name;
    String surname;
}