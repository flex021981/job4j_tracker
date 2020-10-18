package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idDelete = input.askInt("Enter application id for delete:");
        boolean delete = tracker.delete(idDelete);
        System.out.print("Operation result:");
        System.out.println(delete ? "success" : "failure");
        return true;
    }
}
