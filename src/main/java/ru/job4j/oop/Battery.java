package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.setLoad(another.getLoad() + this.load);
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery batOne = new Battery(30);
        Battery batTwo = new Battery(10);
        batOne.exchange(batTwo);
        System.out.println(batOne.getLoad());
        System.out.println(batTwo.getLoad());
    }
}
