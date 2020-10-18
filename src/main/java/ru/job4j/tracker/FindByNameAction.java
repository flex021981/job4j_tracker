package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ====");
        String itemName = input.askStr("Enter application name for find:");
        Item[] findItems = tracker.findByName(itemName);
        out.println("Operation result:");
        if (findItems.length != 0) {
            for (Item item : findItems) {
                out.println("ID: " + item.getId() + " Name: " + item.getName());
            }
        } else {
            out.println("заявка с таким name не найдена.");
        }
        return true;
    }
}
