package com.spring5.todo.repository;

import com.spring5.todo.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ToDoRepository extends CrudRepository<ToDo,String> {
}