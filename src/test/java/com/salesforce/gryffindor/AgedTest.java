package com.salesforce.gryffindor;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AgedTest {
    @Test
    public void testAverageAgeOfStuff() {
        Person julia = new Person("Julia", "Roberts",
                LocalDate.of(1967, 10, 28));
        Person tom = new Person("Tom", "Hanks",
                LocalDate.of(1957, 7, 11));
        Wine wine = new Wine("Chateau Fancy", 1930);

        Object o = julia;
        Person p = julia;
        Ageable q = julia;

        Object o2 = tom;
        Person p2 = tom;
        Ageable q2 = tom;

        Object o3 = wine;
        Wine w3 = wine;
        Ageable q3 = wine;

        //Anonymous instantion of an interface
        Ageable q4 = new Ageable() {
            @Override
            public int getAge() {
                return 10;
            }
        };



        Ageable q5 = new Ageable() {
            @Override
            public int getAge() {
                return 10;
            }
        };

        ArrayList<Ageable> ageableList = new ArrayList<>();
        ageableList.add(tom);
        ageableList.add(julia);
        ageableList.add(wine);
        ageableList.add(q4);

        q5.isTooOld();

        //invoking the static methods
        Ageable.doSomething();
        Ageable.doSomething2();





    }
}
