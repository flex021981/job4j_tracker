package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    private Item item;

    public StartUI(Item item) {
        this.item = item;
    }

    public String getItemCreated() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return item.getCreated().format(formatter);
    }

    public static void main(String[] args) {
        Item item = new Item();
        StartUI startUI = new StartUI(item);
        System.out.println(startUI.getItemCreated());
    }
}