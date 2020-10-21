package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

//static field. Lazy loading.
public class TrackerSingleOne {
    private static TrackerSingleOne instance;
    private Item model;

    private TrackerSingleOne() {
    }

    public static TrackerSingleOne getInstance() {
        if (instance == null) {
            instance = new TrackerSingleOne();
        }
        return instance;
    }

    public Item getModel() {
        return model;
    }

    public Item add(Item model) {
        this.model = model;
        return model;
    }

    public static void main(String[] args) {

        //enum. Eager loading.
        TrackerSingle trackerSingle = TrackerSingle.INSTANCE;
        TrackerSingle trackerSingle2 = TrackerSingle.INSTANCE;
        System.out.println(trackerSingle.getNAME());
        System.out.println(trackerSingle2.getNAME());

        //static field. Lazy loading.
        TrackerSingleOne trackerSingleOne = TrackerSingleOne.getInstance();
        TrackerSingleOne trackerSingleOne1 = TrackerSingleOne.getInstance();
        Item item = new Item();
        item.setName("trackerSingleOne");
        //trackerSingleOne.add(item);
        System.out.println(trackerSingleOne.add(item).getName());
        System.out.println(trackerSingleOne1.getModel().getName());
    }
}

