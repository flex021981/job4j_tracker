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

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== " + menuItems[select] + " ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                System.out.println(menuItems[select] + " name " + tracker.add(item).getName());
            } else if (select == 1) {
                /*Добавить остальные действия системы по меню. */
                System.out.println("=== " + menuItems[select] + " ===");
                Item[] allItems = tracker.findAll();
                for (Item item : allItems) {
                    System.out.println("ID: " + item.getId() + " Name: " + item.getName());
                }
            } else if (select == 2) {
                System.out.println("=== " + menuItems[select] + " ===");
                int idReplace = input.askInt("Enter application id for replace:");
                String nameReplace = input.askStr("Enter application name:");
                Item itemReplace = new Item(nameReplace);
                itemReplace.setName(nameReplace);
                boolean replace = tracker.replace(idReplace, itemReplace);
                System.out.print("Operation result:");
                System.out.println(replace ? "success" : "failure");
            } else if (select == 3) {
                System.out.println("=== " + menuItems[select] + " ===");
                int idDelete = input.askInt("Enter application id for delete:");
                boolean delete = tracker.delete(idDelete);
                System.out.print("Operation result:");
                System.out.println(delete ? "success" : "failure");
            } else if (select == 4) {
                System.out.println("=== " + menuItems[select] + " ===");
                int idFind = input.askInt("Enter application id for find:");
                Item findItem = tracker.findById(idFind);
                System.out.print("Operation result: ");
                System.out.println(
                        findItem == null
                                ? ("заявка с таким id не найдена.")
                                : ("ID: " + findItem.getId() + " Name: " + findItem.getName())
                );
            } else if (select == 5) {
                System.out.println("=== " + menuItems[select] + " ===");
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
