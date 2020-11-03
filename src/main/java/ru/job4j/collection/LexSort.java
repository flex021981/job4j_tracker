package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        left = left.trim().split(". ", 2)[0];
        right = right.trim().split(". ", 2)[0];
        return Integer.compare(Integer.parseInt(left), Integer.parseInt(right));
    }
}
