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
                new Item(1, "One"),
                new Item(2, "Two"),
                new Item(3, "Three"),
                new Item(4, "Four")
        );
        Collections.sort(items, new SortDescending());
        assertEquals("Four", items.get(0).getName());
        assertEquals("Three", items.get(1).getName());
        assertEquals("Two", items.get(2).getName());
        assertEquals("One", items.get(3).getName());
    }

    @Test
    public void sortAscending() {
        List<Item> items = Arrays.asList(
                new Item(1, "One"),
                new Item(2, "Two"),
                new Item(3, "Three"),
                new Item(1, "Four")
        );
        Collections.sort(items, new SortAscending());
        assertEquals("One", items.get(0).getName());
        assertEquals("Four", items.get(1).getName());
        assertEquals("Two", items.get(2).getName());
        assertEquals("Three", items.get(3).getName());
    }
}