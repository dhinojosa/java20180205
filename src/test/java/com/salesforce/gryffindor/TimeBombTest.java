package com.salesforce.gryffindor;

import org.junit.Test;

import java.io.IOException;

public class TimeBombTest {

    @Test
    public void testRuntimeException() {
        TimeBomb timeBomb = new TimeBomb();
        timeBomb.throwARuntimeException();
        System.out.println("Continuing");
    }

    @Test
    public void testArithmeticException() {
        TimeBomb timeBomb = new TimeBomb();
        timeBomb.throwAArithmeticException();
        System.out.println("Continuing");
    }

    @Test
    public void testArithmeticExceptionWithTryCatch() {
        TimeBomb timeBomb = new TimeBomb();
        try {
            timeBomb.throwAArithmeticException();
        } catch (ArithmeticException ae) {
            System.out.println("Yes! We had a problem continue");
        }
        System.out.println("Continuing");
    }

    @Test
    public void testArithmeticExceptionWithTryCatchFinally() {
        TimeBomb timeBomb = new TimeBomb();
        try {
            timeBomb.throwAArithmeticException();
        } catch (ArithmeticException ae) {
            System.out.println("Yes! We had a problem continue");
        } finally {
            //Will always whether successful or failed.
            System.out.println("I'm always running");
        }
        System.out.println("Continuing");
    }

    @Test
    public void testCheckedExceptionByRethrowing() throws Exception{
        TimeBomb timeBomb = new TimeBomb();
        timeBomb.throwACheckedException();
    }

    @Test
    public void testCheckedIOExceptionByRethrowingException() throws Exception{
        TimeBomb timeBomb = new TimeBomb();
        timeBomb.throwAIOException();
    }

    @Test
    public void testCheckedExceptionByHandling() {
        TimeBomb timeBomb = new TimeBomb();
        try {
            timeBomb.throwACheckedException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cleaning Resources");
        }
        System.out.println("Continuing");
    }

    @Test
    public void testCheckedExceptionByHandling2() {
        TimeBomb timeBomb = new TimeBomb();
        try {
            timeBomb.throwACheckedException(5);
        } catch (IOException e) {
            System.out.println("IO" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Regular" + e.getMessage());
        } finally {
            System.out.println("Cleaning Resources");
        }
        System.out.println("Continuing");
    }

    @Test
    public void testHandleAExceptionInAnException() {
        TimeBomb timeBomb = new TimeBomb();
        try {
            timeBomb.throwANestedException();
        } catch (Exception e) {
            e.getCause();
        }
    }
}