package com.salesforce.gryffindor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarShiftTest {


    @Test
    public void testShiftOf0andEmptyString() {
        CaesarShift caesarShift = new CaesarShift(0);
        assertEquals("", caesarShift.encode(""));
    }

    @Test
    public void testShiftOf0AndAStringOfA() {
        CaesarShift caesarShift = new CaesarShift(0);
        assertEquals("a", caesarShift.encode("a"));
    }

    @Test
    public void testShiftOf1AndAStringOfA() {
        CaesarShift caesarShift = new CaesarShift(1);
        assertEquals("b", caesarShift.encode("a"));
    }

}
