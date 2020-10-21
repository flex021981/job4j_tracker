package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

//static final field. Eager loading.
public class TrackerSingleTwo {
    private static final TrackerSingleTwo INSTANCE = new TrackerSingleTwo();
    private int size = 90;

    private TrackerSingleTwo() {
    }

    public void setSize(int size) {
        this.size = size;
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
        TrackerSingleTwo tracker2 = TrackerSingleTwo.getInstance();
        tracker.setSize(60);
        System.out.println(tracker.size);
        System.out.println(tracker2.size);

    }
}
