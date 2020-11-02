package ru.job4j.tracker;

import java.util.Comparator;

public class SortDescItem implements Comparator<Item> {
    @Override
    public int compare(Item itemOne, Item itemTwo) {
        return itemTwo.getName().compareTo(itemOne.getName());
    }
}
