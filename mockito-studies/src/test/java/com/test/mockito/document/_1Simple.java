package com.test.mockito.document;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class _1Simple {

    @Test
    public void test() {
        // mock creation
        List<String> mockedList = mock(List.class);

        // using mock object
        mockedList.add("one");
        mockedList.clear();

        // verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

}
