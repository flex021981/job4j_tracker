package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    private String[] menuItems = {
            "Add new Item",
            "Show all items",
            "Edit item",
            "Delete item",
            "Find item by Id",
            "Find items by name",
            "Exit Program"
    };

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== " + menuItems[select] + " ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                System.out.println("Enter application id for replace:");
                int idReplace = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter application name:");
                String nameReplace = scanner.nextLine();
                Item itemReplace = new Item(nameReplace);
                itemReplace.setName(nameReplace);
                boolean replace = tracker.replace(idReplace, itemReplace);
                System.out.print("Operation result:");
                System.out.println(replace ? "success" : "failure");
            } else if (select == 3) {
                System.out.println("=== " + menuItems[select] + " ===");
                System.out.println("Enter application id for delete:");
                int idDelete = Integer.valueOf(scanner.nextLine());
                boolean delete = tracker.delete(idDelete);
                System.out.print("Operation result:");
                System.out.println(delete ? "success" : "failure");
            } else if (select == 4) {
                System.out.println("=== " + menuItems[select] + " ===");
                System.out.println("Enter application id for find:");
                int idFind = Integer.valueOf(scanner.nextLine());
                Item findItem = tracker.findById(idFind);
                System.out.print("Operation result: ");
                System.out.println(findItem != null ? ("ID: " + findItem.getId() + " Name: " + findItem.getName()) : ("заявка с таким id не найдена."));
            } else if (select == 5) {
                System.out.println("=== " + menuItems[select] + " ===");
                System.out.println("Enter application name for find:");
                String itemName = scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
