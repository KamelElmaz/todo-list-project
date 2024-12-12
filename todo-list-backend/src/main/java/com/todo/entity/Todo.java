package com.todo.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "todo")
public class Todo {

    //Constructors
    public Todo() {
    }

    public Todo(Long id, String task, Long priority) {
        this.id = id;
        this.task = task;
        this.priority = priority;
    }

    //Fields
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(length = 300, nullable = false)
    private String task;

    @Column(nullable = false)
    @Min(value = 1, message = "Priority must be at least 1")
    @Max(value = 3, message = "Priority must be at most 3")
    private Long priority;

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public Long getPriority() {
        return priority;
    }
}
