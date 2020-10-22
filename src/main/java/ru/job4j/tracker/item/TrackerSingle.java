package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

//enum. Eager loading.
public enum TrackerSingle {
    INSTANCE; // здесь мы указываем перечисления.
    // Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }
}
