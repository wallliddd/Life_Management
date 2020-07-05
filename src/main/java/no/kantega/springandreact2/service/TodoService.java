package no.kantega.springandreact2.service;

import no.kantega.springandreact2.dao.TodoDao;
import no.kantega.springandreact2.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoService {

    private final TodoDao todoDao;

    @Autowired
    public TodoService(@Qualifier("todoDao") TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    public int addTodo(Todo todo){
        return todoDao.insertTodo(todo);
    }

    public List<Todo> getAllTodos(){

        return todoDao.selectAllTodos();
    }

}


