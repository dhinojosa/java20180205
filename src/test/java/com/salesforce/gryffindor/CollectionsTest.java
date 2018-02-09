package com.salesforce.gryffindor;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CollectionsTest {
    @Test
    public void testUsingMap() {
        Map<Integer, String> map =
                new HashMap<>();
        map.put(40, "Forty");
        map.put(12, "Twelve");
        assertEquals("Forty", map.get(40));
    }
}
