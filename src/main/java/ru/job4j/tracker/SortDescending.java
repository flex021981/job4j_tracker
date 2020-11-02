package ru.job4j.tracker;

import java.util.Comparator;

public class SortDescending implements Comparator<Item> {
    @Override
    public int compare(Item itemOne, Item itemTwo) {
        int rsl = 0;
        if (itemOne.getId() < itemTwo.getId()) {
            rsl = 1;
        }
        if (itemOne.getId() > itemTwo.getId()) {
            rsl = -1;
        }
        return rsl;
    }
}
