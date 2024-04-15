package com.omer.junit.helper;

import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Quick Before Class");
    }

    @Before
    public void setup(){
        System.out.println("Quick Before Test");
    }

    @Test
    public void test1() {
        System.out.println("Quick test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("Quick test2 executed");
    }

    @After
    public void teardown(){
        System.out.println("Quick After test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Quick After Class");
    }
}
