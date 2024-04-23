package com.test.mockito.business;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class MockExamples {

    @Test
    public void letsMockFeaturesOne(){
        // mock creation
        List mockedList = mock(List.class);
        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    public void letsMockFeaturesTwo(){

        LinkedList mockedList = mock(LinkedList.class);

        when(mockedList.get(0)).thenReturn("one");
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(999));
    }

}
