package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by Id ====");
        int idFind = input.askInt("Enter application id for find:");
        Item findItem = tracker.findById(idFind);
        out.print("Operation result: ");
        out.println(
                findItem == null
                        ? ("заявка с таким id не найдена.")
                        : ("ID: " + findItem.getId() + " Name: " + findItem.getName())
        );
        return true;
    }
}
