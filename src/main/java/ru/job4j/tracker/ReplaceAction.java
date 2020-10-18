package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return " === Update item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
        boolean replace = tracker.replace(id, item);
        System.out.print("Operation result:");
        System.out.println(replace ? "success" : "failure");
        return true;
    }
}
