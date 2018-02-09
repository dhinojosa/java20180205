package com.salesforce.gryffindor;

import java.time.LocalDate;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final HiringStatus hiringStatus;
    private LocalDate orientationDate;

    public Employee(String firstName, String lastName, HiringStatus hiringStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiringStatus = hiringStatus;
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public HiringStatus getHiringStatus() {
        return hiringStatus;
    }

    public void setOrientationDate(LocalDate date) {
        this.orientationDate = date;
    }
}
