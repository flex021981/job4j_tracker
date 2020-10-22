package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

//static final field. Eager loading.
public class TrackerSingleTwo {
    private static final TrackerSingleTwo INSTANCE = new TrackerSingleTwo();

    private TrackerSingleTwo() {
    }

    public static TrackerSingleTwo getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        //static final field. Eager loading.
        TrackerSingleTwo tracker = TrackerSingleTwo.getInstance();

    }
}
