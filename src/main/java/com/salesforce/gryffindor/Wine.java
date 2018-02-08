package com.salesforce.gryffindor;

import java.time.LocalDate;

public class Wine implements Ageable {
    private final String name;
    private final int year;

    public Wine(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - this.year;
    }
}
