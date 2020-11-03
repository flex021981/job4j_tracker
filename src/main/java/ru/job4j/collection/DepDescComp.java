package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String leftDep = left.split("/")[0];
        String rightDep = right.split("/")[0];
        int rsl = rightDep.compareTo(leftDep);
        rsl = (rsl == 0) ? left.compareTo(right) : rsl;
        return rsl;
    }
}
