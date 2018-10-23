package com.tenexperts.app.summatra.array;

import com.tenexperts.app.summatra.array.ArraySummaterException;
import com.tenexperts.app.summatra.array.IArraySummater;
import com.tenexperts.app.summatra.array.PairSummater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairSummaterTest {


    IArraySummater summater;

    @Before
    public void setUp() {
        this.summater = new PairSummater();
    }

    @Test(expected = ArraySummaterException .class)
    public void testNull() throws ArraySummaterException {
        summater.sum(null);
    }

    @Test(expected = ArraySummaterException .class)
    public void testVoidArray() throws ArraySummaterException {
        int[] actual = {};

        summater.sum(actual);
    }

    @Test(expected = ArraySummaterException .class)
    public void testOddLengthArray() throws ArraySummaterException {
        int[] actual = {0,1,2};

        summater.sum(actual);
    }

    @Test
    public void testPositive() throws ArraySummaterException {
        int[] actual = {0,12,32,5,4,21,2,9};
        int expect = 37;

        assertEquals(expect, summater.sum(actual));
    }

    @Test
    public void testNegative() throws ArraySummaterException {
        int[] actual = {0,-12,32,-5,7,21,3,2};
        int expect = 28;

        assertEquals(expect, summater.sum(actual));
    }



}