package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;
//enum. Eager loading.
public enum TrackerSingle {
    INSTANCE, NAME; // здесь мы указываем перечисления.

    private final String name = "NameTrackerSingle";
    // Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }

    public String getNAME() {
        return name;
    }
}
