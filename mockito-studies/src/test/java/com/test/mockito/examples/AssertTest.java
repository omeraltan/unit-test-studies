package com.test.mockito.examples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    private Dummy d1;
    private Dummy d2;
    private Dummy d3;

    @Before
    public void setUp() throws Exception {
        d1 = new Dummy(5);
        d2 = new Dummy(5);
    }

    @Test
    public void testAssertions() throws Exception {
        assertEquals(d1,d2);
    }

    @Test
    public void testAssertionsWithSame() throws Exception {
        d2 = d1;
        assertSame("d1'in d2'ye eşit olması gerekmektedir.", d1,d2);
    }

    @Test
    public void testAssertionsWithNull() throws Exception {
        assertNull(d3);
    }

    @Test
    public void testAssertionsWithNotNull() throws Exception {
        assertNotNull(d1);
    }

    @Test
    public void testAssertionsWithTrue() throws Exception {
        assertTrue(d1.getId() == d2.getId());
        assertTrue(d1 != d2);
        assertTrue(d1.equals(d2));
    }

}

class Dummy {

    private int id;

    public Dummy(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Dummy) obj).getId();
    }

}
