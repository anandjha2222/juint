package com.anand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
    }

    @Test
    void testMultiplicationFrank() {
        Frank five = new Frank(5);
        Frank product = five.times(2);
        assertEquals(new Frank(10), product);
        product = five.times(3);
        assertEquals(new Frank(15), product);
    }

    @Test
    void testEqualityFrank() {
        assertEquals(new Frank(5), new Frank(5));
    }
}
