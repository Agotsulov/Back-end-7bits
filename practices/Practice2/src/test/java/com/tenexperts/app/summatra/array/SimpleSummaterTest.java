package com.tenexperts.app.summatra.array;

import com.tenexperts.app.summatra.array.ArraySummaterException;
import com.tenexperts.app.summatra.array.IArraySummater;
import com.tenexperts.app.summatra.array.SimpleSummater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSummaterTest {


    private IArraySummater summater;

    @Before
    public void setUp() {
        this.summater = new SimpleSummater();
    }

    @Test(expected = ArraySummaterException.class)
    public void testNull() throws ArraySummaterException {
        summater.sum(null);
    }

    @Test(expected = ArraySummaterException .class)
    public void testVoidArray() throws ArraySummaterException {
        int[] actual = {};

        summater.sum(actual);
    }

    @Test
    public void testAll() throws ArraySummaterException {
        int[] actual = {-1,3,-10,4,7,8,1,2};
        int expect = 14;

        assertEquals(expect, summater.sum(actual));
    }

    @Test
    public void testPositive() throws ArraySummaterException {
        int[] actual = {0,12,32,5,4,21,2,9};
        int expect = 85;

        assertEquals(expect, summater.sum(actual));
    }

    @Test
    public void testNegative() throws ArraySummaterException {
        int[] actual = {-12,-32,-5,-7,-21,-3,-2};
        int expect = -82;

        assertEquals(expect, summater.sum(actual));
    }


}