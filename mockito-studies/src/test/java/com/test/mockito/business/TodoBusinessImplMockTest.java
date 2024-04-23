package com.test.mockito.business;

import com.test.mockito.data.api.TodoService;
import com.test.mockito.data.api.TodoServiceStub;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

public class TodoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock() {
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_withEmptyList() {
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList();
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0, filteredTodos.size());
    }

    @Test
    public void testDeleteTodosNotRelatedToSpring_usingBDD(){

        // Given
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        // When
        todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");

        // Then
        //verify(todoServiceMock, atLeast(5)).deleteTodo("Learn to Dance");
        then(todoServiceMock).should().deleteTodo("Learn to Dance");
        then(todoServiceMock).should(never()).deleteTodo("Learn Spring MVC");
        then(todoServiceMock).should(never()).deleteTodo("Learn Spring");
    }

    @Test
    public void testDeleteTodosNotRelatedToSpring_usingBDD_argumentCapture(){

        // Declare Argument Captor
        ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
        // Define Argument captor on specific method call
        // Capture the argument

        // Given
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn to Rock and Roll", "Learn Spring", "Learn to Dance");
        given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        // When
        todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");

        // Then
        //verify(todoServiceMock, atLeast(5)).deleteTodo("Learn to Dance");
        then(todoServiceMock).should(times(2)).deleteTodo(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getAllValues().size(), is(2));

    }

}
