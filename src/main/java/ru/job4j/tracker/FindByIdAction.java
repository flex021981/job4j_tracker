package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idFind = input.askInt("Enter application id for find:");
        Item findItem = tracker.findById(idFind);
        System.out.print("Operation result: ");
        System.out.println(
                findItem == null
                        ? ("заявка с таким id не найдена.")
                        : ("ID: " + findItem.getId() + " Name: " + findItem.getName())
        );
        return true;
    }
}
