package com.test.mockito.document;

import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

public class _2Simple {

    @Test
    public void test() {
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        // following prints "first
        System.out.println(mockedList.get(0));

        // following throws runtime exception
        // System.out.println(mockedList.get(1));

        // following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));

        verify(mockedList).get(0);
    }

}
