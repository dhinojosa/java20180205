package com.salesforce.gryffindor;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigValuesTest {

    @Test
    public void testBigInteger() {
        BigInteger bi = new BigInteger
                ("3939428439823498234857572387483");

        BigInteger bi2 = new BigInteger
                ("5023002304394948383834875723462");

        BigInteger result = bi.add(bi2);
        System.out.println(result);
    }

    @Test
    public void testBigDecimal() {
        double d = 3939392334.12393;
        System.out.println(d);
        BigDecimal bd = new BigDecimal("12394857454.48238347474");
        System.out.println(bd.multiply(new BigDecimal("34.329292")));
    }
}



