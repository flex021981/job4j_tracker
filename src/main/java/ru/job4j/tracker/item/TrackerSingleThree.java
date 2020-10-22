package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;
//private static final class. Lazy loading.
public class TrackerSingleThree {

    private TrackerSingleThree() {
    }

    public static TrackerSingleThree getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingleThree INSTANCE = new TrackerSingleThree();
    }

    public static void main(String[] args) {
        //private static final class. Lazy loading.
        TrackerSingleThree tracker = TrackerSingleThree.getInstance();
    }
}
