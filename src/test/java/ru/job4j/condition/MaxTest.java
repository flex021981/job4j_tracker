package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxTwoNumbers() {
        assertThat(Max.max(3,5), is(5));
    }

    @Test
    public void maxThreeNumbers() {
        assertThat(Max.max(3,5, 100), is(100));
    }

    @Test
    public void maxFourNumbers() {
        assertThat(Max.max(3,5, 10, -15), is(10));
    }
}