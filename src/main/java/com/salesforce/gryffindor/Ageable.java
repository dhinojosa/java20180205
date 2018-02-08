package com.salesforce.gryffindor;

import java.util.function.Supplier;

public interface Ageable {

    public int getAge();

    default boolean isTooOld() {
        return getAge() > 1000;
    }

    default boolean isTooYoung() {
        return getAge() < 5;
    }

    static void doSomething() {
        System.out.println("Hello");
    }

    static void doSomething2() {
        System.out.println("Hello2");
    }
}
