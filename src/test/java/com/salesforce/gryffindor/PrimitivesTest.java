package com.salesforce.gryffindor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class PrimitivesTest {
    @org.junit.Test
    public void testWrappers() {
        //byte => Byte
        //short => Short
        //int => Integer
        //long => Long
        //float => Float
        //double => Double
        //char => Character
        //boolean => Boolean

        Byte b = new Byte((byte) 40);
        Integer i = new Integer(50);
    }

    //Example, List<Integer> not ArrayList<Integer>
    public void foo(List<Integer> list) {

    }

    @Test
    public void testWrappersWithCollection() {
        List<Integer> integerArrayList =
                new ArrayList<>();
        integerArrayList.add(new Integer(40));
        integerArrayList.add(20); //preferred
    }

    @Test
    public void testWrapperUtilities() {
        int i = Integer.parseInt("40");
        assertEquals(40, i);
    }
}
