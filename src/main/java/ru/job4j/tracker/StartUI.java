package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item itemOne = new Item();
        itemOne.setName("nameItemOne");
        itemOne.setId(1);
        Item itemTwo = new Item();
        itemTwo.setName("nameItemTwo");
        itemTwo.setId(2);
        Tracker tracker = new Tracker();
        tracker.add(itemOne);
        tracker.add(itemTwo);
        tracker.findById(1);

    }
}
