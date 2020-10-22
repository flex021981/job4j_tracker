package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

//enum. Eager loading.
public enum TrackerSingleOne {
    INSTANCE; // здесь мы указываем перечисления.
    // Конструкторы и методы.
    private Tracker tracker  = new Tracker();
    public Item add(Item model) {
        tracker.add(model);
        return model;
    }

    public Tracker getTracker() {
        return tracker;
    }
}
