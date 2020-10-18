package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNegativeNumber() {
        int rsl = Fact.calc(-5);
        //assertThat(rsl, is(120));
    }

    @Test
    public void whenPositiveNumber() {
        int rsl = Fact.calc(5);
        assertThat(rsl, is(120));
    }

}