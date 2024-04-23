package com.test.mockito.mockito;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SpyTest {

    @Test
    public void testSpy() {
        List arrayListSpy = spy(ArrayList.class);
        assertEquals(0, arrayListSpy.size());
        // mock return default value
        arrayListSpy.add("Dummy");
        assertEquals(1, arrayListSpy.size());
        arrayListSpy.remove("Dummy");
        assertEquals(0, arrayListSpy.size());
    }

}
