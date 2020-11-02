package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void sortDescending() {
        List<Item> items = Arrays.asList(
                new Item("1"),
                new Item("2"),
                new Item("3"),
                new Item("4")
        );
        Collections.sort(items, new SortDescItem());
        assertEquals("4", items.get(0).getName());
        assertEquals("3", items.get(1).getName());
        assertEquals("2", items.get(2).getName());
        assertEquals("1", items.get(3).getName());
    }

    @Test
    public void sortAscending() {
        List<Item> items = Arrays.asList(
                new Item("1"),
                new Item("2"),
                new Item("3"),
                new Item("1")
        );
        Collections.sort(items, new SortAscItem());
        assertEquals("1", items.get(0).getName());
        assertEquals("1", items.get(1).getName());
        assertEquals("2", items.get(2).getName());
        assertEquals("3", items.get(3).getName());
    }
}