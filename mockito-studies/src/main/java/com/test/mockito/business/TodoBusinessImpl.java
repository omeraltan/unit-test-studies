package com.test.mockito.business;

import com.test.mockito.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;
//TodoBusinessImpl sut
//TodoService Dependency
public class TodoBusinessImpl {

    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);
        for (String todo : todos) {
            if (todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

}
