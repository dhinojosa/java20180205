package com.salesforce.gryffindor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonTest {

    private Person justin1;

    @Before
    public void zoom() {
        justin1 = new Person("Justin", "Timberlake");
    }

    @Test
    public void testPersonEquality() {
        Person justin2 = new Person("Justin", "Timberlake");

        assertEquals(justin1, justin2);
        assertTrue(justin1.equals(justin2)); //object equality
        assertFalse(justin1 == justin2); //reference equality
    }

    @Test
    public void testToString() {
        assertEquals("Person (Justin,Timberlake)", justin1.toString());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Timberlake", justin1.getLastName());
    }

    @Test
    public void testHashCodeWithHashSet() {
        HashSet<Person> peopleSet = new HashSet<>();  //Diamond Operator <>
        Person justin2 = new Person("Justin", "Timberlake");
        peopleSet.add(justin1);
        //Hello
        peopleSet.add(justin2);
        assertEquals(1, peopleSet.size());
    }
    
    //TODO: Immutability or Mutability? What to do?

    @Test
    public void testSettingLastNameImmutability() {
        Person elon = new Person("Elon", "Musk");
        Person copy = elon.setLastName("Musky");
        assertEquals("Musky", copy.getLastName());
        assertEquals("Musk", elon.getLastName());
    }

    @Test
    public void testSomeoneWithMiddleName() {
        Person person = new Person("Matt", "Al", "Smith");
        Optional<String> optional = person.getMiddleName();
        assertTrue(optional.isPresent());
        assertEquals("Al", optional.get()); //unsafe
        assertEquals("Al", optional.orElse("Foo")); //safe
        assertEquals("Al", optional.orElseGet(
        		() -> LocalDate.now().toString()));
    }

    @Test
    public void testSomeoneWithoutMiddleName() {
        Person person = new Person("Gary", "Peralta");
        Optional<String> optional = person.getMiddleName();
        assertFalse(optional.isPresent());
        // optional.get())  //unsafe
        assertEquals("Foo", optional.orElse("Foo")); //safe
        assertEquals("2018", optional.orElseGet(
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return LocalDate.now().toString();
                    }
                }).substring(0, 4));
    }

    @Test
    public void justASampleOfWhatisToCome() {
        OptionalDouble average = IntStream
                .range(2, 10)
                .map(operand -> operand * 2)
                .filter(value -> value >= 10 && value <= 20)
                .average();
        System.out.println(average.orElse(-1.0));
    }

    @Test
    public void canIDoThisWithCollection() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> result = list.stream()
                                    .parallel()
                                    .map(integer -> integer * 2)
                                    .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(result);
    }


    @Test
    public void testSomeoneWithABirthDate() {
        LocalDate localDate = LocalDate.of(1956, 7, 10);
        Person person = new Person("Tom", "Hanks", localDate);
        assertEquals(61, person.getAge());
    }



}
