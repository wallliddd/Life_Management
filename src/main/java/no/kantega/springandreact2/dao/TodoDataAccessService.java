package no.kantega.springandreact2.dao;

import no.kantega.springandreact2.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("todoDao")
public class TodoDataAccessService implements TodoDao {

    private static List<Todo> DB = new ArrayList<>();

    @Override
    public int insertTodo(UUID id, Todo todo) {
        DB.add(new Todo(id, todo.getName()));
        return 1;
    }

    @Override
    public List<Todo> selectAllTodos() {
        return DB;
    }
}


