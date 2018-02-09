package com.salesforce.gryffindor;

public class CaesarShift {
    private final int i;

    public CaesarShift(int i) {
        this.i = i;
    }

    public String encode(String s) {
        if (s.equals("")) return s;
        return String.valueOf((char) (s.charAt(0) + i));
    }
}
