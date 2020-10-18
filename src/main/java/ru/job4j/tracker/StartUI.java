package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),     //Add new Item
                new ShowAction(),       //Show all items
                new ReplaceAction(),    //Edit item
                new DeleteAction(),     //Delete item
                new FindByIdAction(),   //Find item by Id
                new FindByNameAction(), //Find items by name
                new ExitAction()        //Exit Program
        };
        new StartUI().init(input, tracker, actions);
    }
}
