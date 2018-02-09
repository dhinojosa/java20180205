package com.salesforce.gryffindor;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsingGuavaTest {
    @Test
    public void usingBiMap() {
        BiMap<String, String> englishSpanishDictionary =
                HashBiMap.create();

        englishSpanishDictionary.put("banana", "platano");
        englishSpanishDictionary.put("guava", "guayaba");
        englishSpanishDictionary.put("passion fruit", "maracuya");

        BiMap<String, String> spanishEnglishDictionary =
                englishSpanishDictionary.inverse();

        assertEquals("guava", spanishEnglishDictionary.get("guayaba"));

        spanishEnglishDictionary.put("sandia", "watermelon");

        assertEquals("watermelon", spanishEnglishDictionary.get("sandia"));
        assertEquals("sandia", englishSpanishDictionary.get("watermelon"));
    }
}
