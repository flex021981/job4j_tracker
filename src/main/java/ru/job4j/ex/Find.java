package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        String rsl = null;
        if (index >= 0 && index < data.length) {
            rsl = data[index];
        }
        if (rsl == null) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] data = {"onw", "two", "three"};
        String rsl = Find.get(data, 0);
        System.out.println(rsl);
    }
}
