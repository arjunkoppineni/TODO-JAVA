package com.example.todo.entity;

import jakarta.persistence.*;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean completed;

    // Getters and Setters
}
