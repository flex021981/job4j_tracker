package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

//static final field. Eager loading.
public class TrackerSingleThree {
    private static final TrackerSingleThree INSTANCE = new TrackerSingleThree();
    private Tracker tracker;

    private TrackerSingleThree() {
        tracker = new Tracker();
    }

    public Tracker getTracker() {
        return tracker;
    }

    public static TrackerSingleThree getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        tracker.add(model);
        return model;
    }

    public static void main(String[] args) {
        //static final field. Eager loading.
        TrackerSingleThree tracker = TrackerSingleThree.getInstance();

    }
}
