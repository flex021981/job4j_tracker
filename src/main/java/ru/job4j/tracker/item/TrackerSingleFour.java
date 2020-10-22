package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

//private static final class. Lazy loading.
public class TrackerSingleFour {
    private Tracker tracker;

    private TrackerSingleFour() {
        tracker = new Tracker();
    }

    public static TrackerSingleFour getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        tracker.add(model);
        return model;
    }

    public Tracker getTracker() {
        return tracker;
    }

    private static final class Holder {
        private static final TrackerSingleFour INSTANCE = new TrackerSingleFour();
    }

    public static void main(String[] args) {
        //private static final class. Lazy loading.
        TrackerSingleFour tracker = TrackerSingleFour.getInstance();
    }
}
