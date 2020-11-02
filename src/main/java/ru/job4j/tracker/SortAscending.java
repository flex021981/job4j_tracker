package ru.job4j.tracker;

import java.util.Comparator;

public class SortAscending implements Comparator<Item> {
    @Override
    public int compare(Item itemOne, Item itemTwo) {
        return itemOne.compareTo(itemTwo);
    }
}
