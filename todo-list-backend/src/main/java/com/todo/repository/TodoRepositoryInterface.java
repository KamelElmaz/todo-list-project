package com.todo.repository;

import com.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositoryInterface extends JpaRepository<Todo, Long> {
}
