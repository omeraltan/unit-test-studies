package com.test.mockito.business;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// given    : davranışın gerçekleşmesi için gerekli başlangıç koşulları
// when     : davranışın gerçekleşmesi
// then     : davranışın sonuçları

public class ListTest {

    @Test
    public void letsMockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
    }

    @Test
    public void letsMockListSize_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    public void letsMockListGet() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("JavaIsGood");
        assertEquals("JavaIsGood", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void letsMockListAnyInt() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("JavaIsGood");
        assertEquals("JavaIsGood", listMock.get(0));
        assertEquals("JavaIsGood", listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void letsMockListAnyIntAndThrowAnException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));
        assertEquals("JavaIsGood", listMock.get(0));
        assertEquals("JavaIsGood", listMock.get(1));
    }

    @Test
    public void letsMockListGet_usingBDD() {
        //Given
        List<String> listMock = mock(List.class);
        given(listMock.get(anyInt())).willReturn("JavaIsGood");
        // When
        String firstElement = listMock.get(0);

        //Then
        assertThat(firstElement, is("JavaIsGood"));
    }
}
