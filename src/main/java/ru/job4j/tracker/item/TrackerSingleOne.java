package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

//static field. Lazy loading.
public class TrackerSingleOne {
    private static TrackerSingleOne instance;

    private TrackerSingleOne() {
    }

    public static TrackerSingleOne getInstance() {
        if (instance == null) {
            instance = new TrackerSingleOne();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        //enum. Eager loading.
        TrackerSingle trackerSingle = TrackerSingle.INSTANCE;

        //static field. Lazy loading.
        TrackerSingleOne trackerSingleOne = TrackerSingleOne.getInstance();
    }
}

