package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String itemName = input.askStr("Enter application name for find:");
        Item[] findItems = tracker.findByName(itemName);
        System.out.println("Operation result:");
        if (findItems.length != 0) {
            for (Item item : findItems) {
                System.out.println("ID: " + item.getId() + " Name: " + item.getName());
            }
        } else {
            System.out.println("заявка с таким name не найдена.");
        }
        return true;
    }
}
