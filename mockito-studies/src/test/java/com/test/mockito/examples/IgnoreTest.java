package com.test.mockito.examples;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {

    @Test
    public void testMerhaba() throws Exception {
        System.out.println("Merhaba");
    }

    @Test
    @Ignore("Bu method daha sonra kullanılacaktır.")
    public void testMerhaba2() throws Exception {
        System.out.println("Merhaba 2");
    }
}
