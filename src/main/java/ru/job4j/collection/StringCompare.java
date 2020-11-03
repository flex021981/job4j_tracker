package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int lenMin = Math.min(left.length(), right.length());
        for (int i = 0; i < lenMin; i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                break;
            }
        }
        rsl = rsl == 0 ? Integer.compare(left.length(), right.length()) : rsl;
        return rsl;
    }
}
