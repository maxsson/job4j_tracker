package ru.java.oop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(7, 5, 4);
        assertThat(result, is(7));
    }

    @Test
    public void testMax() {
        int result = Max.max(7, 8, 4, 99);
        assertThat(result, is(99));
    }

    @Test
    public void testMax1() {
    }
}