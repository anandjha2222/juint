package com.anand;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("----In before all----");
    }

    @BeforeEach
    void setUp() {
        System.out.println("----In before each----");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld1("Anand"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("----In after each----");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("----In After all----");
    }
}