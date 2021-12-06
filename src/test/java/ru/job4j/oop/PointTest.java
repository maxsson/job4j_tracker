package ru.job4j.oop;


import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 0);
        double rsl = a.distance3d(b);
        Assert.assertEquals(4, rsl, 0.01);
    }

    @Test
    public void when3dFirst() {
        double expected = 5;
        Point a = new Point(0, -3, 3);
        Point b = new Point(3, 1, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3DSecond() {
        double expected = 8.66;
        Point a = new Point(-1, 3, 3);
        Point b = new Point(6, 2, -2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}