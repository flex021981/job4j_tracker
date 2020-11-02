package ru.job4j.tracker;

import java.util.Comparator;

public class SortAscItem implements Comparator<Item> {
    @Override
    public int compare(Item itemOne, Item itemTwo) {
        return itemOne.getName().compareTo(itemTwo.getName());
    }
}
