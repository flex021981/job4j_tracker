package ru.job4j.tracker.item;

import org.junit.Test;
import ru.job4j.tracker.Item;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTests {

    @Test //enum. Eager loading.
    public void trackerSingleOne() {
        Item item = new Item("trackerSingleOne");
        TrackerSingleOne trackerSingleOne = TrackerSingleOne.INSTANCE;
        TrackerSingleOne trackerSingleOne1 = TrackerSingleOne.INSTANCE;
        int id = trackerSingleOne.add(item).getId();
        assertThat(trackerSingleOne1.getTracker().findById(id).getName(), is("trackerSingleOne"));
    }

    @Test //static field. Lazy loading.
    public void trackerSingleTwo() {
        Item item = new Item("trackerSingleTwo");
        TrackerSingleTwo trackerSingleTwo = TrackerSingleTwo.getInstance();
        TrackerSingleTwo trackerSingleTwo1 = TrackerSingleTwo.getInstance();
        int id = trackerSingleTwo.add(item).getId();
        assertThat(trackerSingleTwo1.getTracker().findById(id).getName(), is("trackerSingleTwo"));
    }

    @Test //static final field. Eager loading.
    public void trackerSingleThree() {
        Item item = new Item("trackerSingleThree");
        TrackerSingleThree trackerSingleThree = TrackerSingleThree.getInstance();
        TrackerSingleThree trackerSingleThree1 = TrackerSingleThree.getInstance();
        int id = trackerSingleThree.add(item).getId();
        String trackerSingleThree1Name = trackerSingleThree1.getTracker().findById(id).getName();
        assertThat(trackerSingleThree1Name, is("trackerSingleThree"));
    }

    @Test //private static final class. Lazy loading.
    public void trackerSingleFour() {
        Item item = new Item("trackerSingleFour");
        TrackerSingleFour trackerSingleFour = TrackerSingleFour.getInstance();
        TrackerSingleFour trackerSingleFour1 = TrackerSingleFour.getInstance();
        int id = trackerSingleFour.add(item).getId();
        String trackerSingleFour1Name = trackerSingleFour1.getTracker().findById(id).getName();
        assertThat(trackerSingleFour1Name, is("trackerSingleFour"));
    }
}