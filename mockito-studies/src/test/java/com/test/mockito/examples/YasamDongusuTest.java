package com.test.mockito.examples;

import org.junit.*;

public class YasamDongusuTest {

    @BeforeClass
    public static void setUp1() {
        System.out.println("Her şeyden önce : Before Class");
    }

    @Before
    public void setUp2() throws Exception {
        System.out.println("Method öncesi");
    }

    @Test
    public void testHelloWorld1() {
        System.out.println("Test Hello World 1");
    }

    @Test
    public void testHelloWorld2() {
        System.out.println("Test Hello World 2");
    }

    @After
    public void setUp3 () throws Exception {
        System.out.println("Method Sonrası");
    }

    @AfterClass
    public static void setUp4() {
        System.out.println("Herşeyden Sonra : After Class");
    }
}
