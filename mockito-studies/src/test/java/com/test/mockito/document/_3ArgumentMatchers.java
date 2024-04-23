package com.test.mockito.document;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class _3ArgumentMatchers {

    @Test
    public void test() {

        List<String> mockedList = mock(List.class);
        List<String> deneme = Arrays.asList("Ömer","Ebru","Adil","Elif");

        when(mockedList.get(anyInt())).thenReturn("element");

        System.out.println(mockedList.get(999));
        //verify(mockedList).get(anyInt());
    }

}
