package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ====");
        int idDelete = input.askInt("Enter application id for delete:");
        boolean delete = tracker.delete(idDelete);
        out.print("Operation result:");
        out.println(delete ? "success" : "failure");
        return true;
    }
}
