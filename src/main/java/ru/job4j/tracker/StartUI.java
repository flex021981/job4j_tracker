package ru.job4j.tracker;

public class StartUI {
    private final String[] menuItems = {
            "Add new Item",
            "Show all items",
            "Edit item",
            "Delete item",
            "Find item by Id",
            "Find items by name",
            "Exit Program"
    };

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] allItems = tracker.findAll();
        for (Item item : allItems) {
            System.out.println("ID: " + item.getId() + " Name: " + item.getName());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println(" === Update item ====");
        int id = input.askInt("Enter id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
        tracker.replace(id, item);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int idDelete = input.askInt("Enter application id for delete:");
        boolean delete = tracker.delete(idDelete);
        System.out.print("Operation result:");
        System.out.println(delete ? "success" : "failure");
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        int idFind = input.askInt("Enter application id for find:");
        Item findItem = tracker.findById(idFind);
        System.out.print("Operation result: ");
        System.out.println(
                findItem == null
                        ? ("заявка с таким id не найдена.")
                        : ("ID: " + findItem.getId() + " Name: " + findItem.getName())
        );
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
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
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("\n Menu.");
        /* добавить остальные пункты меню. */
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(i + ". " + menuItems[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
