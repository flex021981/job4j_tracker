package ru.job4j.condition;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(2, 0);
        int expected = 2;
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to02then2() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(0, 2);
        Assert.assertEquals(2, pointOne.distance(pointTwo), 0.01);
    }

    @Test
    public void when02to00then2() {
        Point pointOne = new Point(0, 2);
        Point pointTwo = new Point(0, 0);
        Assert.assertEquals(2, pointOne.distance(pointTwo), 0.01);
    }

    @Test
    public void when20to00then2() {
        Point pointOne = new Point(2, 0);
        Point pointTwo = new Point(0, 0);
        Assert.assertEquals(2, pointOne.distance(pointTwo), 0.01);
    }

    @Test
    public void d3when002to000then2() {
        Point pointOne = new Point(0, 0, 2);
        Point pointTwo = new Point(0, 0, 0);
        Assert.assertEquals(2, pointOne.distance3d(pointTwo), 0.01);
    }

    @Test
    public void d3when000to002then2() {
        Point pointOne = new Point(0, 0, 0);
        Point pointTwo = new Point(0, 0, 2);
        Assert.assertEquals(2, pointOne.distance3d(pointTwo), 0.01);
    }
}