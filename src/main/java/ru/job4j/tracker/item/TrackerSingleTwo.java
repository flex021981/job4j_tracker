package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

//static field. Lazy loading.
public class TrackerSingleTwo {
    private static TrackerSingleTwo instance;
    private Tracker tracker;

    private TrackerSingleTwo() {
        tracker = new Tracker();
    }

    public static TrackerSingleTwo getInstance() {
        if (instance == null) {
            instance = new TrackerSingleTwo();
        }
        return instance;
    }

    public Item add(Item model) {
        tracker.add(model);
        return model;
    }

    public Tracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        //enum. Eager loading.
        TrackerSingleOne trackerSingleOne = TrackerSingleOne.INSTANCE;

        //static field. Lazy loading.
        TrackerSingleTwo trackerSingleTwo = TrackerSingleTwo.getInstance();

    }
}

