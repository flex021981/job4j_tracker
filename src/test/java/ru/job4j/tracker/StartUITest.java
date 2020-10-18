package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenFindAllAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item itemOne = tracker.add(new Item("OneItem"));
        Item itemTwo = tracker.add(new Item("OneItem"));

        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new ShowAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                + "0. Show all items" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "=== Show all items ====" + System.lineSeparator()
                + "ID: 1 Name: OneItem" + System.lineSeparator()
                + "ID: 2 Name: OneItem" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Show all items" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "=== Exit Program ====" + System.lineSeparator()

        ));
    }

    @Test
    public void whenFindByNameAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String findName = "OneItem";
        Item itemOne = tracker.add(new Item(findName));
        Item itemTwo = tracker.add(new Item(findName));

        Input in = new StubInput(
                new String[]{"0", findName, "1"}
        );
        UserAction[] actions = {
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find items by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find items by name ====" + System.lineSeparator()
                        + "Operation result:" + System.lineSeparator()
                        + "ID: 1 Name: OneItem" + System.lineSeparator()
                        + "ID: 2 Name: OneItem" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find items by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Exit Program ====" + System.lineSeparator()

        ));
    }

    @Test
    public void whenFindByIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String findName = "OneItem";
        Item itemOne = tracker.add(new Item(findName));
        Item itemTwo = tracker.add(new Item("TwoItem"));

        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        System.out.println(out.toString());
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find item by Id" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find item by Id ====" + System.lineSeparator()
                        + "Operation result: ID: 1 Name: OneItem" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find item by Id" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Exit Program ====" + System.lineSeparator()

        ));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0" /* входные параметры для ReplaceAction */, "1", replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[]{"0" /* входные параметры для DeleteAction */, "1", "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
                + "=== Exit Program ====" + System.lineSeparator()
        ));
    }
}